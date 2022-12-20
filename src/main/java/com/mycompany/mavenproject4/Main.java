/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject4;

import com.mycompany.mavenproject4.modelo.Produto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SHARK
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digite o caminho: ");
        String strpath=sc.nextLine(); 
        
        File path= new File(strpath);       
        List<Produto> produtos =new ArrayList<>();
        
        //Ler arquivo
        try(BufferedReader br =new BufferedReader(new FileReader(strpath))){
            
           
            while(true){
             
                String line=br.readLine();
                if(line==null){
                    break;
                }
                String[]items=line.split(",");  
                String nome= items[0];
                Double preco= Double.valueOf(items[1]);
                Integer quant= Integer.valueOf(items[2]);
                Produto prod=new Produto(nome,preco,quant);
                produtos.add(prod);
                
            }
                   
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Criar subpasta
        new File(path.getParent()+"\\out").mkdir();
        //Criar arquivo na subpasta
        
        String path2=path.getParent()+"\\out\\summary.crv";
        //Escrever dentro do arquivo
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path2,true))){
            
            for(Produto prod:produtos){
                bw.write(prod.getNome());
                bw.write(",");
                bw.write(String.valueOf(prod.valor()));
                bw.newLine();
            }
     
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
