package dominio;

public class Post {
    private int id;
    private String data;
    private String texto;
    private int idPessoa;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getData(){
        return this.data;
    }
    
    public void setData(String data){
        this.data = data;
    }

    public String getTexto(){
        return this.texto;
    }
    
    public void setTexto(String texto){
        this.texto = texto;
    }
    
    public int getIdPessoa(){
        return idPessoa;
    }
    
    public void setIdPessoa(int idPessoa){
        this.idPessoa = idPessoa;
    }
    
}
