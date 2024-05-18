public class Covid19Data {
    private String region;
    private String aldersgruppe;
    private int bekræftedeTilfælde;
    private int døde;
    private int indlagtePåIntensiv;
    private int indlagte;
    private String dato;

    public Covid19Data(String region, String aldersgruppe, int bekræftedeTilfælde,
                       int døde, int indlagtePåIntensiv, int indlagte, String dato){
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this. bekræftedeTilfælde = bekræftedeTilfælde;
        this.døde = døde;
        this.indlagtePåIntensiv = indlagtePåIntensiv;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    public String getRegion() {
        return region;
    }

    public String getAldersgruppe() {
        return aldersgruppe;
    }

    public int getBekræftedeTilfælde() {
        return bekræftedeTilfælde;
    }

    public int getDøde() {
        return døde;
    }

    public int getIndlagtePåIntensiv() {
        return indlagtePåIntensiv;
    }

    public int getIndlagte() {
        return indlagte;
    }

    public String getDato() {
        return dato;
    }

    public void setAldersgruppe(String aldersgruppe) {
        this.aldersgruppe = aldersgruppe;
    }

    public void setBekræftedeTilfælde(int bekræftedeTilfælde) {
        this.bekræftedeTilfælde = bekræftedeTilfælde;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public void setDøde(int døde) {
        this.døde = døde;
    }

    public void setIndlagte(int indlagte) {
        this.indlagte = indlagte;
    }

    public void setIndlagtePåIntensiv(int indlagtePåIntensiv) {
        this.indlagtePåIntensiv = indlagtePåIntensiv;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString(){
        String result = "";
        result += region + ", " + aldersgruppe + ", " + aldersgruppe + ", " +  bekræftedeTilfælde
                + ", " + døde + ", " + indlagte + ", " + indlagtePåIntensiv + ", " + dato;
        return result;
    }
}
