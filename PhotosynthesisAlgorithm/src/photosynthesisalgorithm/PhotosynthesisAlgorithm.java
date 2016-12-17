
package photosynthesisalgorithm;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.lang.Object;

/**
 *
 * @author Bhavik Nagda
 */
public class PhotosynthesisAlgorithm {
    
    HashMap<String, Double> data_set = new HashMap<>();

    private void readStuffFromDisk(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data_array = line.split(",");
                data_set.put(data_array[0], Double.parseDouble(data_array[1]));                
            } 
        } catch (IOException ex) {
            Logger.getLogger(PhotosynthesisAlgorithm.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
