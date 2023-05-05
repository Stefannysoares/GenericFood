package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.iArquivosController;

public class Principal {

	public static void main(String[] args) {
		iArquivosController arq = new ArquivosController();
		
		String path = "C:\\Users\\FATEC ZONA LESTE\\Desktop\\Stefanny\\Exercicio_Arquivos_GenericFood";
		String nome = "generic_food.csv";
		
		try {
			arq.readFile(path, nome);
		}catch (IOException e){
			e.printStackTrace();
		}

		
	}

}
