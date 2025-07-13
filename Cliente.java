/*
    @author Jessye
 */

public class Cliente{
    private int ID;
    private String name;
    protected String endereco;

    //private só eu (classe atual) usa
    //public qualquer função pode usar
    public int getID(){
        return ID;
    }  //não programar dentro get's e set's

    public void setID(int ID){
        this.ID = ID;
    }

    public String getname(){
        return name;
    }

    public void setname(int name){
        this.name = name;
    }

    public String getEndereco(){
        return Endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;  //"this.endereco" referente a variável
        // após o = refere-se a variável/valor passado como parametro
    }

    public void cadastrarEndereco(String endereco){
        setEndereco(endereco);
    }

    public void imprimirEndereco(){
        System.out.println(this.endereco);
    }

    public String retornarNomeCliente(){
        return "Jessye";
    }

    public int getValorTotal(){
        return 20;
    }

}