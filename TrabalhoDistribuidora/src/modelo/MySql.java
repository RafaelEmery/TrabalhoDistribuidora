package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySql {
	
	Connection conn;
	
	public MySql(String url, String user, String password) {
		  
	    try {
	    	this.conn = DriverManager.getConnection(url, user, password);
	        if (conn != null) {
	        	MySql.criarTables(this.conn);
	            System.out.println("Conectado no banco de dados");
	        }
	    } catch (SQLException ex) {
	        System.out.println("Um erro ocorreu. Usuário ou senha podem estar errados.");
	        ex.printStackTrace();
	    }
	}
	
	public static void criarTables (Connection conn) {
		
		
		String cliente = "CREATE TABLE IF NOT EXISTS `cliente` (\n" + 
				"  `id` int(11) NOT NULL AUTO_INCREMENT,\n" + 
				"  `nome` varchar(45) NOT NULL,\n" + 
				"  `cadastro` varchar(45) NOT NULL,\n" + 
				"  `tipoPessoa` int(11) NOT NULL,\n" + 
				"  `telefone` varchar(45) NOT NULL,\n" + 
				"  PRIMARY KEY (`id`)\n" + 
				") ENGINE=InnoDB DEFAULT CHARSET=latin1;";
		String fornecedor = "CREATE TABLE IF NOT EXISTS `fornecedor` (\n" + 
				"  `id` int(11) NOT NULL AUTO_INCREMENT,\n" + 
				"  `nome` varchar(45) NOT NULL,\n" + 
				"  `cadastro` varchar(45) NOT NULL,\n" + 
				"  `tipoPessoa` int(11) NOT NULL,\n" + 
				"  `telefone` varchar(45) NOT NULL,\n" + 
				"  `cidade` varchar(45) NOT NULL,\n" + 
				"  `estado` varchar(45) NOT NULL,\n" + 
				"  `empresa` varchar(45) NOT NULL,\n" + 
				"  `inedito` tinyint(4) DEFAULT NULL,\n" + 
				"  PRIMARY KEY (`id`)\n" + 
				") ENGINE=InnoDB DEFAULT CHARSET=latin1;";
		String estoque = "CREATE TABLE IF NOT EXISTS `estoque` (\n" + 
				"  `id` int(11) NOT NULL AUTO_INCREMENT,\n" + 
				"  `idProduto` int(11) NOT NULL,\n" + 
				"  `quant` int(11) NOT NULL,\n" + 
				"  PRIMARY KEY (`id`)\n" + 
				") ENGINE=InnoDB DEFAULT CHARSET=latin1;\n";
		String produto = "CREATE TABLE IF NOT EXISTS `produto` (\n" + 
				"  `id` int(11) NOT NULL AUTO_INCREMENT,\n" + 
				"  `nome` varchar(45) NOT NULL,\n" + 
				"  `valor` double NOT NULL,\n" + 
				"  `tipoCerveja` varchar(45) NOT NULL,\n" + 
				"  `porcentagemAlcool` double NOT NULL,\n" + 
				"  `codigoBarra` varchar(45) NOT NULL,\n" + 
				"  PRIMARY KEY (`id`)\n" + 
				") ENGINE=InnoDB DEFAULT CHARSET=latin1;";
		String transacao = "CREATE TABLE IF NOT EXISTS `transacao` (\n" + 
				"  `id` int(11) NOT NULL AUTO_INCREMENT,\n" + 
				"  `idResponsavel` int(11) NOT NULL,\n" + 
				"  `quant` int(11) NOT NULL,\n" + 
				"  `valor` double NOT NULL,\n" + 
				"  `idProduto` int(11) NOT NULL,\n" + 
				"  `desconto` int(11) DEFAULT NULL,\n" + 
				"  PRIMARY KEY (`id`)\n" + 
				") ENGINE=InnoDB DEFAULT CHARSET=latin1;\n" + 
				"";
		String caixa = "CREATE TABLE IF NOT EXISTS `caixa` (\n" + 
				"  `id` int(11) NOT NULL AUTO_INCREMENT,\n" + 
				"  `idTransacao` int(11) NOT NULL,\n" + 
				"  `valorCaixa` double NOT NULL,\n" + 
				"  PRIMARY KEY (`id`)\n" + 
				") ENGINE=InnoDB DEFAULT CHARSET=latin1;\n" + 
				"";
		
		try {
			conn.createStatement().execute(fornecedor);
			conn.createStatement().execute(cliente);
			conn.createStatement().execute(produto);
			conn.createStatement().execute(estoque);
			conn.createStatement().execute(transacao);
			conn.createStatement().execute(caixa);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public void inserirCliente(String nome, String cadastro, int tipoPessoa, String telefone) throws SQLException {
		StringBuilder cliente = new StringBuilder().append("INSERT INTO cliente (nome, cadastro, tipoPessoa, telefone) VALUES (");
		cliente.append("\"").append(nome).append("\"").append(",").append("\"").append(cadastro).append("\"").append(",").append("\"").append(tipoPessoa).append("\"").append(",").append("\"").append(telefone).append("\"").append(");");
		this.conn.createStatement().execute(cliente.toString());
	}
	
	public void inserirFornecedor(String nome, String cadastro, int tipoPessoa, String telefone, String cidade, String estado, String empresa, int inedito) throws SQLException {
		StringBuilder fornecedor = new StringBuilder().append("INSERT INTO fornecedor (nome, cadastro, tipoPessoa, telefone, cidade, estado, empresa, inedito) VALUES (");
		fornecedor.append("\"").append(nome).append("\"").append(",").append("\"").append(cadastro).append("\"").append(",").append("\"").append(tipoPessoa).append("\"").append(",").append("\"").append(telefone).append("\"");
		fornecedor.append(",").append("\"").append(cidade).append("\"").append(",").append("\"").append(estado).append("\"");
		fornecedor.append(",").append("\"").append(empresa).append("\"").append(",").append("\"").append(inedito).append("\"").append(");");
		
		this.conn.createStatement().execute(fornecedor.toString());
	}
	
	public void inserirCaixa(int idTransacao, double valor) throws SQLException {
		StringBuilder caixa = new StringBuilder().append("INSERT INTO caixa (idTransacao, valorCaixa) VALUES (");
		caixa.append("\"").append(idTransacao).append("\"").append(",").append("\"").append(valor).append("\"").append(");");
		this.conn.createStatement().execute(caixa.toString());
	}
	
	public void inserirEstoque(int idProduto, int quant) throws SQLException {
		StringBuilder caixa = new StringBuilder().append("INSERT INTO estoque (idProduto, quant) VALUES (");
		caixa.append("\"").append(idProduto).append("\"").append(",").append("\"").append(quant).append("\"").append(");");
		this.conn.createStatement().execute(caixa.toString());
	}
	
	public void inserirProduto(String nome, double valor, String tipoCerveja, double porcentagemAlcool, String codigoBarras) throws SQLException {
		StringBuilder produto = new StringBuilder().append("INSERT INTO produto (nome, valor, tipoCerveja, porcentagemAlcool, codigoBarra) VALUES (");
		produto.append("\"").append(nome).append("\"").append(",").append("\"").append(valor).append("\"").append(",").append("\"").append(tipoCerveja).append("\"").append(",").append("\"").append(porcentagemAlcool).append("\"").append(",").append("\"").append(codigoBarras).append("\"").append(");");
		this.conn.createStatement().execute(produto.toString());
	}
	
	public void inserirTransacao(int idResponsavel, int quant, double valor, int idProduto, int desconto) throws SQLException {
		StringBuilder transacao = new StringBuilder().append("INSERT INTO transacao (idResponsavel, quant, valor, idProduto, desconto) VALUES (");
		transacao.append("\"").append(idResponsavel).append("\"").append(",").append("\"").append(quant).append("\"").append(",").append("\"").append(valor).append("\"").append(",").append("\"").append(idProduto).append("\"").append(",").append("\"").append(desconto).append("\"").append(");");
		this.conn.createStatement().execute(transacao.toString());
	}
	
	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}
		
}