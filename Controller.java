package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.ScatterChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.util.Callback;
import javafx.util.Duration;
import javafx.util.converter.DoubleStringConverter;
import javafx.util.converter.NumberStringConverter;

import java.awt.*;


public class Controller {

    @FXML
    private TabPane tabPane;

    @FXML
    private Tab coffeeTab;

    @FXML
    private TextField TimeStart;

    @FXML
    private TextField TempStart;

    @FXML
    private TextField RoomTemp;

    @FXML
    private TextField CoolingCoeff;

    @FXML
    private ScatterChart<Double, Double> CfeChart;

    @FXML
    private TableView<XYChart.Data> tableCfe;

    @FXML
    private TableColumn<XYChart.Data, Double> tc1Cfe;

    @FXML
    private TableColumn<XYChart.Data, Double> tc2Cfe;

    @FXML
    private TextField tmaxCoffee;

    @FXML
    private Tab freefallTab;

    @FXML
    private ScatterChart<Double, Double> freefallchartTY;

    @FXML
    private ScatterChart<Double, Double> freefallchartTV;

    @FXML
    private TextField heightfreefall;

    @FXML
    private TextField timestartfreefall;

    @FXML
    private Tab freefallothergTab;

    @FXML
    private ScatterChart<Double, Double> ffothergdrawYT;

    @FXML
    private ScatterChart<Double, Double> ffothergdrawVT;

    @FXML
    private TextField secondg;

    @FXML
    private TextField heightff;

    @FXML
    private Tab fallwithresistTab;

    @FXML
    private ScatterChart<Double, Double> fallresist_lincasechart;

    @FXML
    private ScatterChart<Double, Double> fallresist_quadcasechart;

    @FXML
    private TextField fallwithresistheight;

    @FXML
    private TextField vellincase;

    @FXML
    private TextField velquadcase;
    @FXML
    private Tab exptablefallwithresistTab;

    @FXML
    private TableView<XYChart.Data> tableFallWithResist;

    @FXML
    private TableColumn<XYChart.Data, Double> tc1FallWithResist;

    @FXML
    private TableColumn<XYChart.Data, Double> tc2FallWithResist;

    @FXML
    private Tab fallwithangleTab;

    @FXML
    private ScatterChart<Double, Double> fallwithanglechart;

    @FXML
    private TextField fallwithangle_angle;

    @FXML
    private TextField fallwithangle_height;

    @FXML
    private TextField fallwithangle_v0;

    @FXML
    private Tab fallwithangleresistTab;

    @FXML
    private ScatterChart<Double, Double> fallwithangleresistchart;

    @FXML
    private TextField fallwithangleresist_height;

    @FXML
    private TextField fallwithangleresist_angle;

    @FXML
    private TextField fallwithangleresist_v0;

    @FXML
    private TextField fallwithangleresist_A;

    @FXML
    private Tab orbitmodelTab;

    @FXML
    private ScatterChart<Double, Double> orbitmodelChart;

    @FXML
    private TextField orbitmodel_pos1;

    @FXML
    private TextField orbitmodel_pos2;

    @FXML
    private TextField orbitmodel_vel1;

    @FXML
    private TextField orbitmodel_vel2;

    @FXML
    private Tab keplercheckTab;

    @FXML
    private ScatterChart<Double, Double> keplercheckChart;

    @FXML
    private TextField keplercheck_pos1;

    @FXML
    private TextField keplercheck_pos2;

    @FXML
    private TextField keplercheck_vel1;

    @FXML
    private TextField keplercheck_vel2;

    @FXML
    private TextField keplercheck_vel2_2;

    @FXML
    private TextField keplercheck_pos1_2;

    @FXML
    private TextField keplercheck_pos2_2;

    @FXML
    private TextField keplercheck_vel1_2;

    @FXML
    private Label keplercheck_apow3_2;

    @FXML
    private Label keplercheck_Tpow2_2;

    @FXML
    private Tab keplerimpulseTab;

    @FXML
    private ScatterChart<Double, Double> keplerimpulseChart;

    @FXML
    private TextField keplerimpulse_pos1;

    @FXML
    private TextField keplerimpulse_pos2;

    @FXML
    private TextField keplerimpulse_vel1;

    @FXML
    private RadioButton keplerimpulse_rbtnradial;

    @FXML
    private ToggleGroup impulse;

    @FXML
    private RadioButton keplerimpulse_rbtntang;

    @FXML
    private Tab keplersystemTab;

    @FXML
    private ScatterChart<Double, Double> keplersystemChart;

    @FXML
    private TextField keplersystemdrawperiod;
    @FXML
    private RadioButton lincaserbtn;

    @FXML
    private ToggleGroup resist;

    @FXML
    private RadioButton quadcaserbtn;
    @FXML
    private Label keplercheck_a1lb;

    @FXML
    private Label keplercheck_T1lb;

    @FXML
    private Label keplercheck_e1lb;

    @FXML
    private Label keplercheck_a2lb;

    @FXML
    private Label keplercheck_T2lb;

    @FXML
    private Label keplercheck_e2lb;

    @FXML
    private TextField keplerimpulse_vel2;

    @FXML
    private TextField keplerimpulse_magnitude;

    @FXML
    private TextField keplersystem_pos01_1;

    @FXML
    private TextField keplersystem_pos02_1;

    @FXML
    private TextField keplersystem_vel01_1;

    @FXML
    private TextField keplersystem_pos01_2;

    @FXML
    private TextField keplersystem_pos02_2;

    @FXML
    private TextField keplersystem_vel01_2;
    @FXML
    private TextField keplersystemm2M;

    @FXML
    private TextField keplersystemm1M;

    @FXML
    private Tab helpTab;

    @FXML
    private TextFlow helptextflow;

    @FXML
    private NumberAxis keplerorbitaxis1;

    @FXML
    private NumberAxis keplerorbitaxis2;

    @FXML
    private NumberAxis keplercheck_axis1;

    @FXML
    private NumberAxis keplercheck_axis2;

    @FXML
    private NumberAxis keplerimp_axis1;

    @FXML
    private NumberAxis keplerimp_axis2;

    @FXML
    private NumberAxis orbitmodel_axis1;

    @FXML
    private NumberAxis orbitmodel_axis2;

    @FXML
    private Label keplersys_T1;

    @FXML
    private Label keplersys_T2;

    @FXML
    private Label keplerorbit_e;


    public void initialize(){
        try {
            tabPane.getTabs().remove(coffeeTab);
            tabPane.getTabs().remove(freefallTab);
            tabPane.getTabs().remove(freefallothergTab);
            tabPane.getTabs().remove(fallwithresistTab);
            tabPane.getTabs().remove(fallwithangleTab);
            tabPane.getTabs().remove(fallwithangleresistTab);
            tabPane.getTabs().remove(orbitmodelTab);
            tabPane.getTabs().remove(keplercheckTab);
            tabPane.getTabs().remove(keplerimpulseTab);
            tabPane.getTabs().remove(keplersystemTab);
            tabPane.getTabs().remove(exptablefallwithresistTab);
            tabPane.getTabs().remove(helpTab);

            tableCfe.setItems(ExperimentalData.GetExpCoffeeData);
            tc1Cfe.setCellValueFactory(new PropertyValueFactory<XYChart.Data, Double>("XValue"));
            tc1Cfe.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));
            tc2Cfe.setCellValueFactory(new PropertyValueFactory<XYChart.Data, Double>("YValue"));
            tc2Cfe.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));
            XYChart.Series expcofeedata = new XYChart.Series(ExperimentalData.GetExpCoffeeData);
            expcofeedata.setName("Экспериментальные значения");
            CfeChart.getData().add(expcofeedata);

            tableFallWithResist.setItems(ExperimentalData.GetExpFallWithResistData);
            tc1FallWithResist.setCellValueFactory(new PropertyValueFactory<XYChart.Data, Double>("XValue"));
            tc1FallWithResist.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));
            tc2FallWithResist.setCellValueFactory(new PropertyValueFactory<XYChart.Data, Double>("YValue"));
            tc2FallWithResist.setCellFactory(TextFieldTableCell.forTableColumn(new DoubleStringConverter()));
            XYChart.Series expresistdata = new XYChart.Series(ExperimentalData.GetExpFallWithResistData);
            expresistdata.setName("Экспериментальные значения");
            fallresist_lincasechart.getData().add(expresistdata);

        }
        catch (Exception e){
                ErrorDialog();
            }
    }


    public void ErrorDialog(){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Ошибка!");
        alert.setHeaderText(null);
        alert.setContentText("Произошла ошибка! Проверьте введенные значения и сверьтесь со справкой.");
        alert.showAndWait();
    }

    @FXML
    public void addrowCoffee (ActionEvent event){  //Построить график остывания
        try {
            XYChart.Data newItem = new XYChart.Data(0.0, 0.0);
            tableCfe.getItems().add(newItem);
        }
        catch (Exception e){
            ErrorDialog();
        }
    }

    @FXML
    public void delrowCoffee (ActionEvent event){  //Построить график остывания
        try {
            XYChart.Data selectedItem = tableCfe.getSelectionModel().getSelectedItem();
            tableCfe.getItems().remove(selectedItem);
        }
        catch (Exception e){
            ErrorDialog();
        }
    }

    public XYChart.Series<Double, Double> coffeedata = new XYChart.Series<>();

    @FXML
    public void submitCoffee (ActionEvent event){  //Построить график остывания
        try {
            double room_temp = Double.parseDouble(RoomTemp.getText());
            //double time_start = Double.parseDouble(TimeStart.getText());
            double temp_start = Double.parseDouble(TempStart.getText());
            double r = Double.parseDouble(CoolingCoeff.getText());
            double tmax = Double.parseDouble(tmaxCoffee.getText());
            if (r < 0.000001 || r > 100 || tmax < 1 || tmax > 720) throw new Exception();

            double time_start = 0;
            CfeChart.getData().removeAll(coffeedata);
            coffeedata.getData().clear();
            Cycles coffeecycle = new Cycles();
            coffeedata = coffeecycle.GetCoffeeData(time_start, temp_start, r, room_temp, tmax);
            CfeChart.getData().add(coffeedata);
        }
        catch (Exception e){
            ErrorDialog();
        }
    }

    @FXML
    public void coffeeShow(ActionEvent event) {
        if( !tabPane.getTabs().contains( coffeeTab ) ) {
            tabPane.getTabs().add( coffeeTab );
        }
        tabPane.getSelectionModel().select(coffeeTab);
    }


    @FXML
    private void submitfreefall(ActionEvent event) {  //Свободное падение вблизи поверхности Земли
        try {
            freefallchartTV.getData().clear();
            freefallchartTY.getData().clear();

            double height = Double.parseDouble(heightfreefall.getText());
            //double time = Double.parseDouble(timestartfreefall.getText());
            if (height > 1000000 || height < 0.05) throw new Exception();

            double time = 0;
            Cycles freefallcycle = new Cycles();
            freefallcycle.CalcFreeFallData(height, time);
            XYChart.Series<Double, Double> datY = freefallcycle.GetFreeFallDataY();
            freefallchartTY.getData().add(datY);
            XYChart.Series<Double, Double> datV = freefallcycle.GetFreeFallDataV();
            freefallchartTV.getData().add(datV);
            XYChart.Series<Double, Double> expdatY = freefallcycle.GetFreeFallExpDataY();
            freefallchartTY.getData().add(expdatY);
            XYChart.Series<Double, Double> expdatV = freefallcycle.GetFreeFallExpDataV();
            freefallchartTV.getData().add(expdatV);
        }
        catch (Exception e){
            ErrorDialog();
        }
    }

    @FXML
    public void freefallShow(ActionEvent event) {
        if( !tabPane.getTabs().contains( freefallTab ) ) {
            tabPane.getTabs().add( freefallTab );
        }
        tabPane.getSelectionModel().select(freefallTab);
    }


    @FXML
    private void submitfreefallOtherG(ActionEvent event) {  //Свободное падение для различных значений ускорения свободного падения
        try {
            ffothergdrawYT.getData().clear();
            ffothergdrawVT.getData().clear();

            double height = Double.parseDouble(heightff.getText());
            double g2 = Double.parseDouble(secondg.getText());
            if (Math.abs(g2) > 280 || height > 1000000 || height < 0.05) throw new Exception();

            Cycles freefallwithgcycle = new Cycles();
            freefallwithgcycle.CalcFreeFallDataWithG(height, g2);
            XYChart.Series<Double, Double> datY = freefallwithgcycle.GetFreeFallDataY();
            ffothergdrawYT.getData().add(datY);
            XYChart.Series<Double, Double> datV = freefallwithgcycle.GetFreeFallDataV();
            ffothergdrawVT.getData().add(datV);
            XYChart.Series<Double, Double> expdatY = freefallwithgcycle.GetFreeFallExpDataY();
            ffothergdrawYT.getData().add(expdatY);
            XYChart.Series<Double, Double> expdatV = freefallwithgcycle.GetFreeFallExpDataV();
            ffothergdrawVT.getData().add(expdatV);
        }
        catch (Exception e){
            ErrorDialog();
        }
    }

    @FXML
    public void freefallothergShow(ActionEvent event) {
        if( !tabPane.getTabs().contains( freefallothergTab ) ) {
            tabPane.getTabs().add( freefallothergTab );
        }
        tabPane.getSelectionModel().select(freefallothergTab);
    }

    //Падение с учетом сопротивления воздуха

    public XYChart.Series<Double,Double> resistcalcData = new XYChart.Series<>();

    @FXML
    void submitfall_lincase(ActionEvent event) {
        try {
            resistcalcData.getData().clear();
            fallresist_lincasechart.getData().removeAll(resistcalcData);

            double height = Double.parseDouble(fallwithresistheight.getText());
            double v2_lin = Double.parseDouble(vellincase.getText());
            double v2_quad = Double.parseDouble(velquadcase.getText());
            if (height < 0.05 || height > 5000 || v2_lin < 0.5 || v2_quad < 0.5 || v2_lin > 5000 || v2_quad> 5000) throw new Exception();

            Cycles fallwithresistcycle = new Cycles();
            fallwithresistcycle.CalcFallWithResistData(height, v2_lin, v2_quad);
            resistcalcData.setName("Вычисленные значения");

            if (lincaserbtn.isSelected()) {
                XYChart.Series<Double, Double> lincasedata = fallwithresistcycle.GetData1();
                resistcalcData = fallwithresistcycle.GetData1();
                fallresist_lincasechart.getData().add(lincasedata);
            }
            if (quadcaserbtn.isSelected()){
                XYChart.Series<Double, Double> quadcasedata = fallwithresistcycle.GetData2();
                resistcalcData = fallwithresistcycle.GetData2();
                fallresist_lincasechart.getData().add(quadcasedata);
            }
        }
        catch (Exception e){
            ErrorDialog();
        }
    }


    @FXML
    void addrowFallWithResist(ActionEvent event) {
        try {
            XYChart.Data newItem = new XYChart.Data(0.0, 0.0);
            tableFallWithResist.getItems().add(newItem);
        }
        catch (Exception e){
            ErrorDialog();
        }
    }

    @FXML
    void delrowFallWithResist(ActionEvent event) {
        try {
            XYChart.Data selectedItem = tableFallWithResist.getSelectionModel().getSelectedItem();
            tableFallWithResist.getItems().remove(selectedItem);
        }
        catch (Exception e){
            ErrorDialog();
        }
    }


    @FXML
    void fallwithresistshow(ActionEvent event) {
        if( !tabPane.getTabs().contains( fallwithresistTab ) ) {
            tabPane.getTabs().add( fallwithresistTab );
        }
        tabPane.getSelectionModel().select(fallwithresistTab);
    }

    //Падение под углом без учета сопротивления воздуха

    XYChart.Series<Double, Double> Rmax = new XYChart.Series<>();
    XYChart.Series<Double, Double> fallwithangledata = new XYChart.Series<>();

    @FXML
    void clearfallwithangle(ActionEvent event) {
        fallwithanglechart.getData().clear();
    }

    @FXML
    void submitfallwithangle(ActionEvent event) {
        try {
            double height = Double.parseDouble(fallwithangle_height.getText());
            double alpha = Double.parseDouble(fallwithangle_angle.getText());
            double v0 = Double.parseDouble(fallwithangle_v0.getText());
            if (alpha > 90 || alpha < 0 || v0 > 5000 || v0 < 0 || height > 10000 || height < 0) throw new Exception();

            Rmax.getData().clear();
            fallwithanglechart.getData().removeAll(Rmax);
            Rmax.setName("Максимальное расстояние");
            Rmax.getData().add(new XYChart.Data<>(v0*v0 / 9.82, 0.0));
            fallwithanglechart.getData().add(Rmax);

            //fallwithangledata.getData().clear();
            Cycles fallwithangle = new Cycles();
            fallwithangle.CalcFallWithAngleData(alpha, height, v0);
            fallwithangledata = fallwithangle.GetFallDataXY();
            fallwithanglechart.getData().add(fallwithangledata);
        }
        catch (Exception e){
            ErrorDialog();
        }
    }

    @FXML
    void fallwithangleShow(ActionEvent event) {
        if( !tabPane.getTabs().contains( fallwithangleTab ) ) {
            tabPane.getTabs().add( fallwithangleTab );
        }
        tabPane.getSelectionModel().select(fallwithangleTab);
        fallwithanglechart.getData().add(Rmax);
        fallwithanglechart.getData().add(fallwithangledata);
    }

    //Падение под углом c учетом сопротивления воздуха
    @FXML
    void clearfallwithangleresist(ActionEvent event) {
        fallwithangleresistchart.getData().clear();
    }

    @FXML
    void submitfallwithangleresist(ActionEvent event) {
        try{
        double height = Double.parseDouble(fallwithangleresist_height.getText());
        double alpha = Double.parseDouble(fallwithangleresist_angle.getText());
        double v0 = Double.parseDouble(fallwithangleresist_v0.getText());
        double A = Double.parseDouble(fallwithangleresist_A.getText());
        if (height < 0 || height > 100 || alpha > 90 || alpha < 0 || v0 > 5000 || v0 < 0 || A > 10 || A < 0.0001) throw new Exception();

        Cycles fallwithangleresist = new Cycles();
        fallwithangleresist.CalcFallWithAngleWithResistData(alpha,height,v0,A);
        XYChart.Series<Double, Double> fallwithangleresistdata = fallwithangleresist.GetFallDataXY();
        fallwithangleresistchart.getData().add(fallwithangleresistdata);
        }
        catch (Exception e){
            ErrorDialog();
        }
    }

    @FXML
    void fallwithangleresistShow(ActionEvent event) {
        if( !tabPane.getTabs().contains( fallwithangleresistTab ) ) {
            tabPane.getTabs().add( fallwithangleresistTab );
        }
        tabPane.getSelectionModel().select(fallwithangleresistTab);
    }

    //Моделирование круговой орбиты
    @FXML
    void orbitmodelClear(ActionEvent event) {
        orbitmodelChart.getData().clear();
    }

    @FXML
    void orbitmodelSubmit(ActionEvent event) {
        try{
        double pos1 = Double.parseDouble(orbitmodel_pos1.getText());
        double pos2 = Double.parseDouble(orbitmodel_pos2.getText());
        double vel1 = Double.parseDouble(orbitmodel_vel1.getText());
        double vel2 = Double.parseDouble(orbitmodel_vel2.getText());
        if (Math.abs(pos1) > 10 || Math.abs(pos2) > 10 || Math.abs(vel1) > 0.01 || Math.abs(vel2) > 0.01) throw new Exception();
        keplerorbitaxis1.setUpperBound(Math.max(Math.abs(pos1),Math.abs(pos2))+0.5);
        keplerorbitaxis1.setLowerBound(-Math.max(Math.abs(pos1),Math.abs(pos2))-0.5);
        keplerorbitaxis2.setUpperBound(Math.max(Math.abs(pos1),Math.abs(pos2))+0.5);
        keplerorbitaxis2.setLowerBound(-Math.max(Math.abs(pos1),Math.abs(pos2))-0.5);
        keplerorbitaxis2.setTickUnit(keplerorbitaxis1.getTickUnit());

        Cycles orbitmodelcycle = new Cycles();
        orbitmodelcycle.CalcKeplerOrbitModelingData(pos1,pos2,vel1,vel2);
        XYChart.Series<Double, Double> orbitmodeldata = orbitmodelcycle.GetData1();
        orbitmodeldata.setName("vx="+ vel1+" vy="+vel2);
        orbitmodelChart.getData().add(orbitmodeldata);

            FromCoordToElem elements1 = new FromCoordToElem();
            elements1.GetElements(pos1,pos2,vel1,vel2);
            double e = elements1.getE();
            keplerorbit_e.setText(String.format("%.3f",e));
        }
        catch (Exception e){
            ErrorDialog();
        }
    }

    @FXML
    void orbitmodelShow(ActionEvent event) {
        if( !tabPane.getTabs().contains( orbitmodelTab ) ) {
            tabPane.getTabs().add( orbitmodelTab );
            keplerorbit_e.setText("");
        }
        tabPane.getSelectionModel().select(orbitmodelTab);
    }

    //Проверка 3 закона Кеплера
     @FXML
    void keplercheckClear(ActionEvent event) {
        keplercheckChart.getData().clear();
         keplercheck_apow3_2.setText("");
         keplercheck_Tpow2_2.setText("");
         keplercheck_a1lb.setText("");
         keplercheck_T1lb.setText("");
         keplercheck_e1lb.setText("");
         keplercheck_a2lb.setText("");
         keplercheck_T2lb.setText("");
         keplercheck_e2lb.setText("");
    }

    @FXML
    void keplercheckSubmit(ActionEvent event) {
        try{
            keplercheckChart.getData().clear();
        double pos1 = Double.parseDouble(keplercheck_pos1.getText());
        double pos2 = Double.parseDouble(keplercheck_pos2.getText());
        double vel1 = Double.parseDouble(keplercheck_vel1.getText());
        double vel2 = Double.parseDouble(keplercheck_vel2.getText());
        if (Math.abs(pos1) > 10 || Math.abs(pos2) > 10 || Math.abs(vel1) > 0.01 || Math.abs(vel2) > 0.01) throw new Exception();

        Cycles keplercheckcycle = new Cycles();
        keplercheckcycle.CalcKeplerOrbitModelingData(pos1,pos2,vel1,vel2);
        XYChart.Series<Double, Double> keplercheckdata = keplercheckcycle.GetData1();
        keplercheckdata.setName("Орбита 1");
        keplercheckChart.getData().add(keplercheckdata);
        //double a = 0.5 * pos1;
       // double T = Math.sqrt(a*a*a);
            FromCoordToElem elements1 = new FromCoordToElem();
            elements1.GetElements(pos1,pos2,vel1,vel2);
            double a = elements1.getA();
            double T = elements1.getT();
            double e = elements1.getE();
             keplercheck_a1lb.setText(String.format("%.3f",a));
             keplercheck_T1lb.setText(String.format("%.3f",T));
            keplercheck_e1lb.setText(String.format("%.3f",e));


        double pos1_2 = Double.parseDouble(keplercheck_pos1_2.getText());
        double pos2_2 = Double.parseDouble(keplercheck_pos2_2.getText());
        double vel1_2 = Double.parseDouble(keplercheck_vel1_2.getText());
        double vel2_2 = Double.parseDouble(keplercheck_vel2_2.getText());
        if (Math.abs(pos1_2) > 10 || Math.abs(pos2_2) > 10 || Math.abs(vel1_2) > 0.01 || Math.abs(vel2_2) > 0.01) throw new Exception();

            double maxval = Math.max(Math.abs(pos1),Math.abs(pos2));
            if (maxval < Math.max(Math.abs(pos1_2),Math.abs(pos2_2))) maxval = Math.max(Math.abs(pos1_2),Math.abs(pos2_2));
            keplercheck_axis1.setUpperBound(maxval+0.5);
            keplercheck_axis1.setLowerBound(-maxval-0.5);
            keplercheck_axis2.setUpperBound(maxval+0.5);
            keplercheck_axis2.setLowerBound(-maxval-0.5);
            keplercheck_axis2.setTickUnit(keplercheck_axis1.getTickUnit());

        Cycles keplercheckcycle_2 = new Cycles();
        keplercheckcycle_2.CalcKeplerOrbitModelingData(pos1_2,pos2_2,vel1_2,vel2_2);
        XYChart.Series<Double, Double> keplercheckdata_2 = keplercheckcycle_2.GetData1();
        keplercheckdata_2.setName("Орбита 2");
        keplercheckChart.getData().add(keplercheckdata_2);
        //double a_2 = 0.5 * pos1_2;
        //double T_2 = Math.sqrt(a_2*a_2*a_2);
            FromCoordToElem elements2 = new FromCoordToElem();
            elements2.GetElements(pos1_2,pos2_2,vel1_2,vel2_2);
            double a_2 = elements2.getA();
            double T_2 = elements2.getT();
            double e_2 = elements2.getE();

  keplercheck_a2lb.setText(String.format("%.3f",a_2));
 keplercheck_T2lb.setText(String.format("%.3f",T_2));
 keplercheck_e2lb.setText(String.format("%.3f",e_2));

        keplercheck_apow3_2.setText(String.format("%.3f", (a*a*a)/(a_2*a_2*a_2)));
        keplercheck_Tpow2_2.setText(String.format("%.3f", (T*T)/(T_2*T_2)));
        }
        catch (Exception e){
            ErrorDialog();
        }
    }

    @FXML
    void keplercheckShow(ActionEvent event) {
        if( !tabPane.getTabs().contains( keplercheckTab ) ) {
            tabPane.getTabs().add( keplercheckTab );
        }
        tabPane.getSelectionModel().select( keplercheckTab );
        keplercheck_apow3_2.setText("");
        keplercheck_Tpow2_2.setText("");
        keplercheck_a1lb.setText("");
        keplercheck_T1lb.setText("");
        keplercheck_e1lb.setText("");
        keplercheck_a2lb.setText("");
        keplercheck_T2lb.setText("");
        keplercheck_e2lb.setText("");
    }

    //Влияние возмущений на форму орбиты
    @FXML
    void keplerimpulseClear(ActionEvent event) {
        keplerimpulseChart.getData().clear();
    }

    @FXML
    void keplerimpulseSubmit(ActionEvent event) {
        try{
        double pos1 = Double.parseDouble(keplerimpulse_pos1.getText());
        double pos2 = Double.parseDouble(keplerimpulse_pos2.getText());
        double vel1 = Double.parseDouble(keplerimpulse_vel1.getText());
        double vel2 = Double.parseDouble(keplerimpulse_vel2.getText());
        double magnitude = Double.parseDouble(keplerimpulse_magnitude.getText());
        if (Math.abs(pos1) > 10 || Math.abs(pos2) > 10 || Math.abs(vel1) > 0.01 || Math.abs(vel2) > 0.01 || Math.abs(magnitude) > 10000) throw new Exception();
            keplerimp_axis1.setUpperBound(Math.max(Math.abs(pos1),Math.abs(pos2))+0.5);
            keplerimp_axis1.setLowerBound(-Math.max(Math.abs(pos1),Math.abs(pos2))-0.5);
            keplerimp_axis2.setUpperBound(Math.max(Math.abs(pos1),Math.abs(pos2))+0.5);
            keplerimp_axis2.setLowerBound(-Math.max(Math.abs(pos1),Math.abs(pos2))-0.5);
            keplerimp_axis2.setTickUnit(keplerimp_axis1.getTickUnit());
            // double vel2 = Double.parseDouble(keplerimpulse_vel2.getText());
        int key=0;
        if (keplerimpulse_rbtnradial.isSelected()) {key=0;}
        if (keplerimpulse_rbtntang.isSelected()) {key=1;}
        Cycles keplerimpulsecycle = new Cycles();
        keplerimpulsecycle.CalcKeplerImpulseData(key,pos1,pos2,vel1,vel2,magnitude);
        XYChart.Series<Double, Double> keplerimpulsedata = keplerimpulsecycle.GetData2();
        keplerimpulsedata.setName("Орбита до возмущения");
        keplerimpulseChart.getData().add(keplerimpulsedata);
        XYChart.Series<Double, Double> keplerimpulsechangeddata = keplerimpulsecycle.GetData1();
        keplerimpulsechangeddata.setName("Орбита после возмущения");
        keplerimpulseChart.getData().add(keplerimpulsechangeddata );
        }
        catch (Exception e){
            ErrorDialog();
        }
    }

    @FXML
    void keplerimpulseShow(ActionEvent event) {
        if( !tabPane.getTabs().contains( keplerimpulseTab ) ) {
            tabPane.getTabs().add( keplerimpulseTab );
        }
        tabPane.getSelectionModel().select( keplerimpulseTab );
    }

    //Моделирование двумерной "солнечной системы"
    XYChart.Series<Double, Double> keplersystemseries1 = new XYChart.Series<>();
    XYChart.Series<Double, Double> keplersystemseries2 = new XYChart.Series<>();
    XYChart.Series<Double, Double> keplersystemsourceseries1 = new XYChart.Series<>();
    XYChart.Series<Double, Double> keplersystemsourceseries2 = new XYChart.Series<>();
    int j = 0;
    //double k = 1000;
    double l1, l2, k;
    Timeline updateChart;

    @FXML
    void keplersystemSubmit(ActionEvent event) {
        try{
        double T = Double.parseDouble(keplersystemdrawperiod.getText());
        double pos01_1 = Double.parseDouble(keplersystem_pos01_1.getText());
        double pos02_1 = Double.parseDouble(keplersystem_pos02_1.getText());
        double vel01_1 = Double.parseDouble(keplersystem_vel01_1.getText());
        if (Math.abs(pos01_1) > 10 || Math.abs(pos02_1) > 10 || Math.abs(vel01_1) > 0.01 || T < 0 || T > 120) throw new Exception();

        double m1M = Double.parseDouble(keplersystemm1M.getText());
        double pos01_2 = Double.parseDouble(keplersystem_pos01_2.getText());
        double pos02_2 = Double.parseDouble(keplersystem_pos02_2.getText());
        double vel01_2 = Double.parseDouble(keplersystem_vel01_2.getText());
        double m2M = Double.parseDouble(keplersystemm2M.getText());
        if (Math.abs(pos01_2) > 10 || Math.abs(pos02_2) > 10 ||  Math.abs(vel01_2) > 0.01  || Math.abs(m1M) > 0.01 || Math.abs(m2M) > 0.01 ) throw new Exception();

        double r1 = Math.sqrt(pos01_1*pos01_1 + pos02_1*pos02_1), r2 = Math.sqrt(pos01_2*pos01_2 + pos02_2*pos02_2);
        double GM = 2.9591220828559110225E-4;
        FromCoordToElem elements1 = new FromCoordToElem();
        elements1.GetElements(pos01_1,pos02_1,vel01_1,Math.sqrt(GM / r1));
        double T1 = elements1.getT();
        keplersys_T1.setText(String.format("%.3f",T1));
        FromCoordToElem elements2 = new FromCoordToElem();
        elements2.GetElements(pos01_2,pos02_2,vel01_2,Math.sqrt(GM / r2));
        double T2 = elements2.getT();
        keplersys_T2.setText(String.format("%.3f",T2));

        double maxval = Math.max(Math.abs(pos01_1 ),Math.abs(pos02_1 ));
        if (maxval < Math.max(Math.abs(pos01_2),Math.abs(pos02_2))) maxval = Math.max(Math.abs(pos01_2),Math.abs(pos02_2));
        orbitmodel_axis1.setUpperBound(maxval+0.5);
        orbitmodel_axis1.setLowerBound(-maxval-0.5);
        orbitmodel_axis2.setUpperBound(maxval+0.5);
        orbitmodel_axis2.setLowerBound(-maxval-0.5);
        orbitmodel_axis2.setTickUnit(orbitmodel_axis1.getTickUnit());

        Cycles keplersystemcycle = new Cycles();
        keplersystemcycle.CalcKeplerSystemData(pos01_1,pos02_1,vel01_1,pos01_2,pos02_2,vel01_2,m1M,m2M);
        XYChart.Series<Double, Double> keplersystemdata = keplersystemcycle.GetData1();
        XYChart.Series<Double, Double> keplersystemdata2 = keplersystemcycle.GetData2();
        keplersystemsourceseries1 = keplersystemdata;
        keplersystemsourceseries2 = keplersystemdata2;
        l1 = keplersystemsourceseries1.getData().size();
        l2 = keplersystemsourceseries2.getData().size();
        if (l1!=l2) {k = Math.max(l1,l2);}
        else k=l1;
        keplersystemChart.getData().add(keplersystemseries1);
        keplersystemChart.getData().add(keplersystemseries2);
        updateChart = new Timeline(new KeyFrame(Duration.seconds(T), chartUpdater));
        updateChart.setCycleCount(Timeline.INDEFINITE);
        updateChart.play();
        }
        catch (Exception e){
            ErrorDialog();
        }
    }

    EventHandler<ActionEvent> chartUpdater = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            if (j <= k) {
                keplersystemseries1.getData().add(j, keplersystemsourceseries1.getData().get(j));
                keplersystemseries2.getData().add(j, keplersystemsourceseries2.getData().get(j));
                j++;
                keplersystemseries1.setName("Планета 1");
                keplersystemseries2.setName("Планета 2");
            }
            if (j == k ) {
                updateChart.stop();
            }
        }
    };

    @FXML
    void keplersystemClear(ActionEvent event) {
        keplersystemChart.getData().clear();
        keplersystemseries1.getData().clear();
        keplersystemseries2.getData().clear();
        keplersystemsourceseries1.getData().clear();
        keplersystemsourceseries2.getData().clear();
        updateChart.stop();
        j = 0;
    }

    @FXML
    void keplersystemShow(ActionEvent event) {
        if( !tabPane.getTabs().contains( keplersystemTab ) ) {
            tabPane.getTabs().add( keplersystemTab );
        }
        tabPane.getSelectionModel().select( keplersystemTab );
    }

}
