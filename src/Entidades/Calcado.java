package Entidades;

public class Calcado {
    private int idCalcado;
    private int idGerente;
    private TipoCalcado tipoCalcado;
    private String modeloCalcado;
    private double preco;

    public Calcado(int idCalcado, int idGerente, TipoCalcado tipoCalcado, String modeloCalcado, double preco){
        this.idCalcado = idCalcado;
        this.idGerente = idGerente;
        this.tipoCalcado = tipoCalcado;
        this.modeloCalcado = modeloCalcado;
        this.preco = preco;
    }

    public Calcado(int idGerente, TipoCalcado tipoCalcado, String modeloCalcado, double preco){
        this.idGerente = idGerente;
        this.tipoCalcado = tipoCalcado;
        this.modeloCalcado = modeloCalcado;
        this.preco = preco;
    }

    public int getIdCalcado() {
        return idCalcado;
    }
    public void setIdCalcado(int idCalcado) {
        this.idCalcado = idCalcado;
    }
    public int getIdGerente() {
        return idGerente;
    }
    public void setIdGerente(int idGerente) {
        this.idGerente = idGerente;
    }
    public TipoCalcado getTipoCalcado() {
        return tipoCalcado;
    }
    public void setTipoCalcado(TipoCalcado tipoCalcado) {
        this.tipoCalcado = tipoCalcado;
    }
    public String getModeloCalcado() {
        return modeloCalcado;
    }
    public void setModeloCalcado(String modeloCalcado) {
        this.modeloCalcado = modeloCalcado;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
}
