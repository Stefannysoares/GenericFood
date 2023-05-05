package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArquivosController implements iArquivosController{

	@Override
	public void readFile(String path, String nome) throws IOException {
		File arq = new File (path,nome);
		if (arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while (linha != null) {
				String [] separa = linha.split(",");
				if (separa[2].equals ("Fruits")) {

					System.out.println(separa[0]+ "\t"+separa[1]+"\t"+separa[3]);
					
				}
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		}else {
			throw new IOException ("Arquivo Inválido");
		}
		
	}

}
