<%-- 
    Document   : CadastroCarroPopular
    Created on : 13/06/2012, 10:55:38
    Author     : aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="carropopular" class="modelo.CarroPopular" scope="page" />
<jsp:setProperty name="carropopular" property="*" />
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro Carro Popular</title>
    </head>
    <body>
        

        <form name="form" action="ControleCarroPopular.java" method="POST">
             <table border="0">
            <tbody>
                 <tr>
                     <td>Modelo:</td> <td><input type="text" name="modelo" value="" /><br></td>
            </tr>
             <tr>
                 <td>Cor:</td> <td><input type="text" name="cor" value="" /><br></td>
            </tr>
             <tr>
                 <td>Combustível:</td> <td><input type="text" name="combustivel" value="" /><br></td>
            </tr>
             <tr>
                 <td>Ano de Fabricação:</td> <td><input type="text" name="anofabricacao" value="" /><br></td>
            </tr>
             <tr>
                 <td>Ano Modelo:</td> <td><input type="text" name="anomodelo" value="" /><br></td>
            </tr>
             <tr>
                 <td>Preço:</td><td><input type="text" name="preco" value="" /><br></td>
            </tr>
             <tr>
                 <td>Vidro Elétrico:</td>
            <td>
                <select name="vidroeletrico">
                <option>Selecione</option>
                <option>Sim</option>
                <option>Não</option>
            </select>
            <br></td>
            </tr>
             <tr>
            <td>
            Som:
            </td>
            <td>
            <select name="som">
                <option>Selecione</option>
                <option>Sim</option>
                <option>Não</option>
            </select>
            <br></td>
            </tr>
             <tr>
                 <td>Ar-Condicionado:</td>
                 <td><select name="arcondicionado">
                <option>Selecione</option>
                <option>Sim</option>
                <option>Não</option>
            </select>
            <br></td>
            </tr>
             <tr>
                 <td>Direção Hidraulica: </td>
                 <td><select name="direcaoHidraulica">
                <option>Selecione</option>
                <option>Sim</option>
                <option>Não</option>
            </select>
            <br></td>
            </tr>
             <tr>
            <td>Trava Elétrica: </td>
            <td><select name="travaEletrica">
                <option>Selecione</option>
                <option>Sim</option>
                <option>Não</option>
            </select>
            <br></td>
            </tr>
             <tr>
                 
            <td><input type="submit" value="Cadastrar" name="btn" /></td>
            </tr>
        </tbody>
        </table>
        </form>
    </body>
</html>
<% String nome = "cadastrar";%>