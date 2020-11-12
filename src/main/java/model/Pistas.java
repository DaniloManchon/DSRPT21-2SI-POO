package model;

public class Pistas {
    private int id;
    private String latitude;
    private String longitude;
    private String elevacao;
    private String nome;
    private String cidade;
    private String pais;
    private String info;

    public Pistas(int id, String latitude, String longitude, String elevacao, String nome, String cidade, String pais, String info) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.elevacao = elevacao;
        this.nome = nome;
        this.cidade = cidade;
        this.pais = pais;
        this.info = info;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getElevacao() {
        return elevacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getPais() {
        return pais;
    }

    public String getInfo() {
        return info;
    }

}
