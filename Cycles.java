package sample;

import javafx.scene.chart.XYChart;

public class Cycles {

    public XYChart.Series<Double, Double> resultdataXY;
    public XYChart.Series<Double, Double> resultdataY;
    public XYChart.Series<Double, Double> resultdataV;
    public XYChart.Series<Double, Double> resultexpdataY;
    public XYChart.Series<Double, Double> resultexpdataV;
    public XYChart.Series<Double, Double> resultdata1;
    public XYChart.Series<Double, Double> resultdata2;
    public double GM = 2.9591220828559110225E-4;/*GM=4*Math.PI*Math.PI;*/

    public XYChart.Series<Double, Double> GetCoffeeData(double time_start, double temp_start, double r, double room_temp, double tmax){
        double time_cur, temp_cur, dt=0.00001, print_period = 1, nprt, ncalc;
        XYChart.Series<Double, Double> tempdata = new XYChart.Series<>();
        tempdata.setName("Вычисленные значения");
        time_cur=time_start;//начальное время
        temp_cur=temp_start;//начальная температура
        nprt = tmax / print_period;
        ncalc = print_period/dt;
        for (int iprt=1;iprt<=nprt;iprt++){
            EulerClass EulerResult = new EulerClass();
            EulerResult.Euler(ncalc,r,temp_cur,room_temp,dt,time_cur);
            temp_cur = EulerResult.getTemp();
            time_cur = EulerResult.getTime();
            tempdata.getData().add(new XYChart.Data<>(time_cur, temp_cur));
        }
        return tempdata;
    }

    public void CalcFreeFallData(double height, double time) {
        double y = 0, v = 0, g = 9.8, dt = 0.00001, print_period = 0.1, ncalc, v_exp = 0, y_exp = 0;
        ncalc = print_period / dt;

        XYChart.Series<Double, Double> dataY = new XYChart.Series<>();
        dataY.setName("Вычисленные значения");
        XYChart.Series<Double, Double> dataV = new XYChart.Series<>();
        dataV.setName("Вычисленные значения");
        XYChart.Series<Double, Double> expdataY = new XYChart.Series<>();
        expdataY.setName("Точные значения");
        XYChart.Series<Double, Double> expdataV = new XYChart.Series<>();
        expdataV.setName("Точные значения");

        do {
            EulerClass EulerResult = new EulerClass();
            EulerResult.EulerFreeFall(ncalc, dt, y, v, g, time);
            time = EulerResult.getTime();
            y = EulerResult.getY();
            v = EulerResult.getV();
            v_exp = g * time;
            y_exp = v_exp * time - g * time * time / 2;
            dataY.getData().add(new XYChart.Data<>(time, y));
            dataV.getData().add(new XYChart.Data<>(time, v));
            expdataY.getData().add(new XYChart.Data<>(time, y_exp));
            expdataV.getData().add(new XYChart.Data<>(time, v_exp));
        } while (y < height);
        resultdataY = dataY;
        resultdataV = dataV;
        resultexpdataY = expdataY;
        resultexpdataV = expdataV;
    }

 
    public void CalcKeplerOrbitModelingData (double pos_01, double pos_02, double vel_01, double vel_02){
        double dt = 0.01, sumpos = Math.abs(pos_01)+Math.abs(pos_02), tmax = (sumpos)*400 /*Полное время (дни)*/, plot_period;
        double ncalc, nplot;
        double pos1=pos_01, pos2=pos_02, vel1=vel_01, vel2=vel_02;
        if (Math.abs(pos_01)>=3 || Math.abs(pos_02)>=3) {plot_period = 1; tmax=(sumpos)*1000;}
        else {plot_period = 0.1;}
        if (Math.abs(pos_01) > 7 || Math.abs(pos_02) > 7) {tmax=(sumpos)*1500;}
        if (Math.abs(pos_01) >= 10 || Math.abs(pos_02) >= 10) {tmax=(sumpos)*2000;}
        ncalc = plot_period / dt;
        nplot = tmax / plot_period;
        XYChart.Series<Double, Double> tempdata = new XYChart.Series<>();
        for (int iplot=1;iplot<=nplot;iplot++){
            EulerClass EulerResult = new EulerClass();
            EulerResult.EulerKeplerOrbitModeling(ncalc, dt, pos1, pos2, vel1, vel2);
            pos1 = EulerResult.getResultPos1();
            pos2 = EulerResult.getResultPos2();
            vel1 = EulerResult.getResultVel1();
            vel2 = EulerResult.getResultVel2();
            tempdata.getData().add(new XYChart.Data<>(pos1, pos2));
        }
        resultdata1 = tempdata;
    }


    public XYChart.Series<Double, Double> GetFallDataXY() {
        return resultdataXY;
    }
    public XYChart.Series<Double, Double> GetFreeFallDataY() {
        return resultdataY;
    }
    public XYChart.Series<Double, Double> GetFreeFallDataV() {
        return resultdataV;
    }
    public XYChart.Series<Double, Double> GetFreeFallExpDataY() {
        return resultexpdataY;
    }
    public XYChart.Series<Double, Double> GetFreeFallExpDataV() {
        return resultexpdataV;
    }
    public XYChart.Series<Double, Double> GetData1() {
        return resultdata1;
    }
    public XYChart.Series<Double, Double> GetData2() {
        return resultdata2;
    }



}
