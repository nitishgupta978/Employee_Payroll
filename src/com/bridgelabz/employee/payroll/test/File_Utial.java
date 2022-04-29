package com.bridgelabz.employee.payroll.test;

import java.io.File;

public class File_Utial {
	public static boolean filesDelete(File filesToDelete) {
        File[] allFiles=filesToDelete.listFiles();
        if(allFiles !=null) {
            for(File file: allFiles)
            	filesDelete(file);
        }
        return filesToDelete.delete();
}
}
