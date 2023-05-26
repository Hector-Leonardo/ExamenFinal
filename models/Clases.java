package models;

public class Clases {
    private int cantidadH;
    private   int tiempoP;
    private   int aroma;
    private int azucar;
    private int nicotina;

    public Clases() {
    }

    public Clases(int cantidadH, int tiempoP, int aroma, int azucar, int nicotina) {
        this.cantidadH = cantidadH;
        this.tiempoP = tiempoP;
        this.aroma = aroma;
        this.azucar = azucar;
        this.nicotina = nicotina;
    }

    public int getCantidadH() {
        return cantidadH;
    }

    public int getTiempoP() {
        return tiempoP;
    }

    public int getAroma() {
        return aroma;
    }

    public int getAzucar() {
        return azucar;
    }

    public int getNicotina() {
        return nicotina;
    }

    public void setCantidadH(int cantidadH) {
        this.cantidadH = cantidadH;
    }

    public void setTiempoP(int tiempoP) {
        this.tiempoP = tiempoP;
    }

    public void setAroma(int aroma) {
        this.aroma = aroma;
    }

    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }

    public void setNicotina(int nicotina) {
        this.nicotina = nicotina;
    }

    @Override
    public String toString() {
        return "principal{" +
                "cantidadH=" + cantidadH +
                ", tiempoP=" + tiempoP +
                ", aroma=" + aroma +
                ", azucar=" + azucar +
                ", nicotina=" + nicotina +
                '}';
    }
}
