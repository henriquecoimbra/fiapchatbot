package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ibm.watson.developer_cloud.conversation.v1.model.MessageResponse;

import br.com.fiap.bean.Retorno;
import br.com.fiap.factory.ConnectionFactorySQL;

public class SalaDAO {

	public SalaDAO() {

	}

	public Retorno disponibilidadeData(MessageResponse resp, String dateBooking) throws SQLException {
		Retorno retorno = new Retorno(404, "Não existe salas disponíveis para essa data.", "");

		String sql =	"SELECT a.cd_sala " + 
						"FROM   (SELECT s.cd_sala, " + 
						"Trunc(rs.dt_entrada), " + 
						"SUM(Round(( dt_saida - dt_entrada ) * 1440.0) / 30) total_cliclos " + 
						"FROM   t_r10_sala s " + 
						"left join t_r10_reserva_sala rs " + 
						"ON s.cd_sala = rs.cd_sala " + 
						"WHERE  Trunc(rs.dt_entrada) = To_char(DATE '"+ dateBooking +"', 'DD/MM/YYYY') " + 
						"GROUP  BY s.cd_sala, " + 
						"Trunc(rs.dt_entrada)) A " + 
						"right join t_r10_sala S " + 
						"ON S.cd_sala = A.cd_sala " + 
						"WHERE  A.total_cliclos < 48 " + 
						"OR A.total_cliclos IS NULL";
		try (Connection con = new ConnectionFactorySQL().getConnection();
				PreparedStatement ps = con.prepareStatement(sql)) {			
			try (ResultSet result = ps.executeQuery()) {				
				while (result.next()) {					
					retorno.setIdRetorno(200);
					retorno.setMsgRetorno("Salas consultadas com sucesso.");
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return retorno;
		}
	}

	public Retorno disponibilidadeCapacidade(MessageResponse resp, String dateBooking, String numberPeople) throws SQLException {
		Retorno retorno = new Retorno(404, "Não existe salas disponíveis para essa quantidade de pessoas.", "");

		String sql =	"SELECT a.cd_sala " + 
						"FROM   (SELECT s.cd_sala, " + 
						"Trunc(rs.dt_entrada), " + 
						"SUM(Round(( dt_saida - dt_entrada ) * 1440.0) / 30) total_cliclos " + 
						"FROM   t_r10_sala s " + 
						"left join t_r10_reserva_sala rs " + 
						"ON s.cd_sala = rs.cd_sala " + 
						"WHERE  Trunc(rs.dt_entrada) = To_char(DATE '"+ dateBooking +"', 'DD/MM/YYYY') " + 
						"GROUP  BY s.cd_sala, " + 
						"Trunc(rs.dt_entrada)) A " + 
						"right join t_r10_sala S " + 
						"ON S.cd_sala = A.cd_sala " + 
						"WHERE  A.total_cliclos < 48 " + 
						"OR A.total_cliclos IS NULL AND S.qt_capacidade >= "+ numberPeople ;
		try (Connection con = new ConnectionFactorySQL().getConnection();
				PreparedStatement ps = con.prepareStatement(sql)) {			
			try (ResultSet result = ps.executeQuery()) {				
				while (result.next()) {					
					retorno.setIdRetorno(200);
					retorno.setMsgRetorno("Quantidade das salas consultadas com sucesso.");
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return retorno;
		}
	}

}