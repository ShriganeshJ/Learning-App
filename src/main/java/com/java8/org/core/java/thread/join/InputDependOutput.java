package org.core.java.thread.join;
 class FileProcessor implements  Runnable
{

        private String filename;

        public FileProcessor(String filename) {
            this.filename = filename;
        }

        @Override
        public void run() {
            System.out.println("Processing file: " + filename);
            // Simulate file processing
            try {
                Thread.sleep(2000); // Simulate processing time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("File processed: " + filename);
        }
    }

    public class InputDependOutput {
        public static void main(String[] args) {
            String[] filesToProcess = {"file1.txt", "file2.txt", "file3.txt"};

            // Create threads for processing each file
            Thread[] threads = new Thread[filesToProcess.length];
            for (int i = 0; i < filesToProcess.length; i++) {
                threads[i] = new Thread(new FileProcessor(filesToProcess[i]));
                threads[i].start();
            }

            // Wait for all threads to finish
            for (Thread thread : threads) {
                try {
                    thread.join(); // Wait for each thread to finish
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("All files processed. Proceeding to the next step...");
            // Add code to proceed to the next step of your application
        }
    }

