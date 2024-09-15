package Model;

import java.io.*;

public class cow {
    private String cowData = "Model/cowData.csv";

    //check is cow in csv or not
    public boolean cowIsHere(String id) {
        boolean isHere = false;
        try (BufferedReader br = new BufferedReader(new FileReader(cowData))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(id)) {
                    isHere = true; 
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
        return isHere;
    }
    //check  is cow or goat
    public boolean isItCow(String id) {
        boolean isCow = true;
        try (BufferedReader br = new BufferedReader(new FileReader(cowData))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(id)) {
                    
                    if (data[1].equals("-")) {
                        isCow = false;
                    }
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
        return isCow;
    }

    // get cow year age
    public int getAgeYear(String id) {
        int ageYear = -1; // Return -1 if not found
        try (BufferedReader br = new BufferedReader(new FileReader(cowData))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(id)) {
                    ageYear = Integer.parseInt(data[1]); // get ageYear value
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
        return ageYear;
    }

    // get cow month age
    public int getAgeMonth(String id) {
        int ageMonth = -1; // will return -1 if not found
        try (BufferedReader br = new BufferedReader(new FileReader(cowData))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(id)) {
                    ageMonth = Integer.parseInt(data[2]); // get ageMonth value
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
        return ageMonth;
    }

    //get umber of udder
    public int getUdder(String id) {
        int udder = -1; // will return -1 if not found
        try (BufferedReader br = new BufferedReader(new FileReader(cowData))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(id)) {
                    udder = Integer.parseInt(data[3]); // get udder value
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading CSV file: " + e.getMessage());
        }
        return udder;
    }

    public void setUdder(String id, int udder) {
        File inputFile = new File(cowData);
        File tempFile = new File("Model/temp_cowData.csv");

    }

}
