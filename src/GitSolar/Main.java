package GitSolar;

public class Main {
    public static void main(String[] args) {
        SolarSystem FactorX=new SolarSystem();
        FactorX.Sun="1";
        FactorX.Moon="4";
        FactorX.Planet="2";
        FactorX.Stars="1000";

        //adding features to Sun
        FeatureSun Xfact=new FeatureSun();
        Xfact.color="green";
        Xfact.radius="1000000000km";
        Xfact.heat="3094545456kj";

        //adding the features for the star in solar sstem
        FeatureStars FacX= new FeatureStars();
        FacX.color="green";
        FacX.radius="213235254";
        FacX.size="99999999";


        //adding features for planet2
        Planet2 Olso = new Planet2();
        Olso.name="Ozhan";
        Olso.size="694254km";
        Olso.color="red";

        //adding planet features
        Planet1Feature Mars=new Planet1Feature();
        Mars.color="blue";
        Mars.size="34234523424";
        Mars.name="PlanetX";

    }
}
