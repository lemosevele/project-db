package dominio;

public class Pessoa {
    private int id;
    private String nome;
    private int idade;
    private String foto;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }   

    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public String getFoto(){
        return this.foto;
    }
    
    public void setFoto(String foto){
        this.foto = foto;
    }     
}
