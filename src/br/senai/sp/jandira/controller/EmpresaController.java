package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class EmpresaController {

    //Instanciar Conexão
    Conexao conexao = new Conexao();

    // Referencia do nosso banco no Controller
    Connection connection = conexao.getConnection();

    //Responsavel por executar a query
    Statement statement;

    {
        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void consultarFuncionarios() throws SQLException {
        //Query
        String queryConsulta = "SELECT * FROM funcionario";

        //Armazena o retorno do banco
        ResultSet resultSet = statement.executeQuery(queryConsulta);

        while (resultSet.next()){

            int idFuncionario = resultSet.getInt("idFuncionario");
            String nome = resultSet.getString("nome");
            String sobrenome = resultSet.getString("sobrenome");
            int matricula = resultSet.getInt("matricula");

            System.out.println("----------------------------");
            System.out.println(idFuncionario);
            System.out.println(nome + " " + sobrenome);
            System.out.println(matricula);
            System.out.println("----------------------------");

        }

    }

    public void consultarDepartamento() throws SQLException {


        //Query
        String queryConsulta = "SELECT * FROM departamento";

        //Armazena o retorno do banco
        ResultSet resultSet = statement.executeQuery(queryConsulta);

        while (resultSet.next()){

            int idDepartamento = resultSet.getInt("idDepartamento");
            String nome = resultSet.getString("nome");
            String sigla = resultSet.getString("sigla");


            System.out.println("----------------------------");
            System.out.println(idDepartamento);
            System.out.println(nome);
            System.out.println(sigla);
            System.out.println("----------------------------");

        }

    }

}
