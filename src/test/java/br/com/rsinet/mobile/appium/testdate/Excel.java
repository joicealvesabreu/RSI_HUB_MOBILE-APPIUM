package br.com.rsinet.mobile.appium.testdate;

import br.com.rsinet.mobile.appium.utility.Constant;
import br.com.rsinet.mobile.appium.utility.ExcelUtils;

public class Excel extends Constant{
	
		

		public  String sUsuario() throws Exception {
		//	ExcelUtils.setExcelFile(
			//	"./br.com.rsinet.mobile.appium.testdate/Dados.xlsx", "Planilha1");
			ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planilha1");
			String sUsuario = ExcelUtils.getCellData(16, 0);
			return sUsuario;
		}

		public String sEmail() throws Exception {
			String sEmail = ExcelUtils.getCellData(1, 1);
			return sEmail;
		}

		public String sSenha() throws Exception {
			String sSenha = ExcelUtils.getCellData(1, 2);
			return sSenha;
		}

		public String sConfirmarSenha() throws Exception {
			String sConfirmarSenha = ExcelUtils.getCellData(1, 2);
			return sConfirmarSenha;
		}

		public String sPrimeiroNome () throws Exception {
			String sPrimeiroNome = ExcelUtils.getCellData(1, 3);
			return sPrimeiroNome;
		}

		public String sUltimoNome() throws Exception {
			String sUltimoNome = ExcelUtils.getCellData(1, 4);
			return sUltimoNome;
		}

		public String sTelefone() throws Exception {
			String sTelefone = ExcelUtils.getCellData(1, 5);
			return sTelefone;
		}

		public String sPais() throws Exception {
			String sPais = ExcelUtils.getCellData(1, 6);
			return sPais;
		}

		public String sCidade() throws Exception {
			String sCidade = ExcelUtils.getCellData(1, 7);
			return sCidade;
		}

		public String sEndereco() throws Exception {
			String sEndereco = ExcelUtils.getCellData(1, 8);
			return sEndereco;
		}

		public String sEstado() throws Exception {
			String sEstado = ExcelUtils.getCellData(1, 9);
			return sEstado;
		}

		public  String sCep() throws Exception {
			String sCep = ExcelUtils.getCellData(1, 10);
			return sCep;
		}
		
		public static String sLaptop() throws Exception {
			String sLaptop =ExcelUtils.getCellData(1, 11);
			return sLaptop;
		}
	
	}

	
	
