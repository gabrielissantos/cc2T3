/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t3cc2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

/**
 *
 * @author Gabrieli Santos
 */
public class T3CC2 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    
    public static void main(String[] args) throws IOException, RecognitionException {
        SaidaParser out = new SaidaParser();
        casamentoParser.ProgramaContext arvore = null; //para a analise semantica
        try{
            CharStream input = CharStreams.fromFileName(args[0]); //entrada
            casamentoLexer lexer = new casamentoLexer(input);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            casamentoParser parser = new casamentoParser(tokenStream);
            //parser.addErrorListener(new ErrorListener(out));
            arvore = parser.programa();
        }
        catch(ArrayIndexOutOfBoundsException aiobe){
            System.out.println("Erro: nenhum arquivo de entrada foi dado ao executar o compilador.");
        }
        
        //analise semantica
        /*if(!out.isModificado()){
            casamentoSemanticAnalyzer semantico = new casamentoSemanticAnalyzer(out);
            semantico.visitPrograma(arvore);
        }*/
        
        
        File saida = new File(args[1]);
        try (PrintWriter pw = new PrintWriter(new FileOutputStream(saida))) {
            out.println("Fim da compilacao");
            pw.print(out.toString());
            pw.flush();
        }
    }
    
}











