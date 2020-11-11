package model;

public class Pistas {
    int id;
    String latitude;
    String longitude;
    String elevacao;
    String nome;
    String cidade;
    String pais;
    String info;

    public Pistas(int id, String latitude, String longitude, String nome, String cidade, String pais) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.nome = nome;
        this.cidade = cidade;
        this.pais = pais;
    }

    public Pistas(int id, String latitude, String longitude, String nome, String cidade, String pais, String info) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.nome = nome;
        this.cidade = cidade;
        this.pais = pais;
        this.info = info;
    }

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

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getElevacao() {
        return elevacao;
    }

    public void setElevacao(String elevacao) {
        this.elevacao = elevacao;
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

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
