
public class TesteConexao {
	
	public static void main(String[] args) {
	    Conexao con = null;
	    
	    
	    /*Dessa forma o Finally fica implicito, para isso apenas 
        precisamos implementar a interface AutoCloseable e definir as 
        regras do metodo close*/
	    try(Conexao conexao = new Conexao() ){
	        conexao.leDados();
	    } catch(IllegalStateException ex){  //indica que um objeto possui um estado inválido.
	        System.out.println("Deu erro na conexão");
	    }
	    
	    
//	    try {
//	        con = new Conexao();
//	        con.leDados();
//	    } catch(IllegalStateException ex) {
//	        System.out.println("Deu erro na conexao");
//      } finally {
//	        con.fecha();
//	    }
	}
	
	
}

