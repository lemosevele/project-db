package dominio;

public class Foto {
    private int id;
    private String imagem;
    private int idPost;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getImagem(){
        return this.imagem;
    }
    
    public void setImagem(String imagem){
        this.imagem = imagem;
    }
    
    public int getIdPost(){
        return idPost;
    }
    
    public void setIdPost(int idPost){
        this.idPost = idPost;
    }
}
