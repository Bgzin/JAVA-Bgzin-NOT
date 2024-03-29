package app.Connection;

/**
 * VendasDAO
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import app.Model.Vendas;

public class VendasDAO {

    // Atributosy
    private Connection connection;
    private List<Vendas> vendas;

    // Construtor
    public VendasDAO() {
        this.connection = ConnectionFactory.getConnection();
    }

    // Métodos do CRUD
    // criar Tabela
    public void criaTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS vendas_lojacarros2 (MARCA VARCHAR(255), MODELO VARCHAR(255), VALOR VARCHAR(255) ,PLACA VARCHAR(255) PRIMARY KEY, CLIENTE VARCHAR(255), DATAHORA VARCHAR(255))";

        try (Statement stmt = this.connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso.");

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar a tabela: " + e.getMessage(), e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    // Listar todos os valores cadastrados
    public List<Vendas> listarTodos() {
        PreparedStatement stmt = null; // Declaração do objeto PreparedStatement para executar a consulta

        ResultSet rs = null; // Declaração do objeto ResultSet para armazenar os resultados da consulta

        vendas = new ArrayList<>(); // Cria uma lista para armazenar as vendas recuperadas do banco de dados

        try {
            stmt = connection.prepareStatement("SELECT * FROM vendas_lojacarros2");
            // Prepara a consulta SQL para selecionar todos os registros da tabela
            rs = stmt.executeQuery();
            // Executa a consulta e armazena os resultados no ResultSet
            while (rs.next()) {
                // Para cada registro no ResultSet, cria um objeto vendas com os valores do
                // registro

                Vendas venda = new Vendas(
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getString("valor"),
                        rs.getString("placa"),
                        rs.getString("cliente"),
                        rs.getString("dataHora"));
                vendas.add(venda); // Adiciona o objeto vendas à lista de vendas
            }
        } catch (SQLException ex) {
            System.out.println(ex); // Em caso de erro durante a consulta, imprime o erro
        } finally {
            ConnectionFactory.closeConnection(connection, stmt, rs);

            // Fecha a conexão, o PreparedStatement e o ResultSet
        }
        return vendas; // Retorna a lista de vendas recuperados do banco de dados
    }

    // Cadastrar Carro no banco
    public void vender(String marca, String modelo, String valor, String placa, String cliente, String dataHora) {
        PreparedStatement stmt = null;
        // Define a instrução SQL parametrizada para cadastrar na tabela
        String sql = "INSERT INTO vendas_lojacarros2 (marca, modelo, valor, placa, cliente, dataHora) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, marca);
            stmt.setString(2, modelo);
            stmt.setString(3, valor);
            stmt.setString(4, placa);
            stmt.setString(5, cliente);
            stmt.setString(6, dataHora);
            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso");

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    // Atualizar dados no banco
    public void atualizar(String marca, String modelo, String valor, String placa, String cliente, String dataHora) {
        PreparedStatement stmt = null;
        // Define a instrução SQL parametrizada para atualizar dados pela placa
        String sql = "UPDATE vendas_lojacarros2 SET marca = ?, modelo = ?, valor = ?, WHERE placa = ?, cliente = ? dataHora = ?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, marca);
            stmt.setString(2, modelo);
            stmt.setString(3, valor);
            // placa é chave primaria não pode ser alterada.
            stmt.setString(4, placa);
            stmt.setString(5, cliente);
            stmt.setString(6, dataHora);
            stmt.executeUpdate();
            System.out.println("Dados atualizados com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    // Apagar dados do banco
    public void apagar(String placa) {
        PreparedStatement stmt = null;
        // Define a instrução SQL parametrizada para apagar dados pela placa
        String sql = "DELETE FROM vendas_lojacarros2 WHERE placa = ?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, placa);
            stmt.executeUpdate(); // Executa a instrução SQL
            System.out.println("Dado apagado com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao apagar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

    // Apagar dados de outro banco
    public void apagarCarro(String placa) {
        PreparedStatement stmt = null;
        // Define a instrução SQL parametrizada para apagar dados pela placa
        String sql = "DELETE FROM carros_lojacarros WHERE placa = ?";
        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, placa);
            stmt.executeUpdate(); // Executa a instrução SQL
            System.out.println("Dado apagado com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao apagar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }

}