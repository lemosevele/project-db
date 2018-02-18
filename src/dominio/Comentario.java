package dominio;

public class Comentario {
    private int id;
    private String texto;
    private String data;
    private int idPost;
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
    
    public int getIdPost(){
        return idPost;
    }
    
    public void setIdPost(int idPost){
        this.idPost = idPost;
    }    
}
