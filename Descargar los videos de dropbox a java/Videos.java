/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Videos;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author vejat
 */
public class Videos {
    //private static final String ACCESS_TOKEN = "sl.A0QgrtxFXEAdHXuIIw4ca0C1k7TN-rBtqC2gNIbNiMxx0guX0I6eXAnzyi9s1nv5fW7X8admGn483ZZ_deFIuroUENxFMFm80W6yP2_oLJ0C5gbt7-yyuzo919VGw8o-hDhenac";
    var dbx = new Dropbox ({accessToken: ACCESS_TOKEN});
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Generando el acceso al cliente de dropbox  utilizando el access token de la app dropbox
        
       
        DbxRequestConfig config = DbxRequestConfig.newBuilder("dropbox/java-Videos").build();
        DbxClientV2 client = new DbxClientV2(config, ACCESS_TOKEN);
        
        
        
        // Descargar archivo de dropbox al equipo
        try{
            
            // Se indica la ruta y el nombre del archivo a descargar de la nube de dropbox
            DbxDownloader downloader= client.files().download("/Videos/Guasón - Tráiler Oficial (Sub. Español)");
            
            ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
            //Se copia la infomracion del pdf en el flujo de bytes del objeto baos
            downloader.dowload(baos);
            //Se indica el nombre del archivo pdf donde se almacenara la informacion a guardar en el equipo
            File archivo = new File ("C:\\Users\\vejat\\OneDrive\\Documentos\\drop");
            
            byte[] archivoBytes= baos.toByteArray();
            //Se comvierte el flujo de bytes en un objeto de stream para crear el archivo ccon el metodo write
            FileOutputStream fileOutputStream = new FileOutputStream(archivo);
            fileOutputStream.write(archivoBytes);
            fileOutputStream.close();
            baos.close();
        }catch(DbxException e){
            e.printStackTrace();  
        }catch(IOException e){
            e.printStackTrace();  
        }
        
        
    }
    
}
