package com.hyt.test.pydemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestRunPython {
    public static void main(String[] args) throws IOException, InterruptedException {
        String pyParam = "";
        String pythonScriptPath = "C:\\testPython.py";
        String[] arguments = new String[]{"python", pythonScriptPath, pyParam};
        Process proc = Runtime.getRuntime().exec(arguments);
        proc.waitFor();
        BufferedReader br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
