package org.lld.structural.adapter;

public class JpgShower implements AdvancedImageViewer{

   @Override
   public void showPng(String fileName) {
      //do nothing
   }

   @Override
   public void showJpg(String fileName) {
      System.out.println("Showing jpg file. Name: "+ fileName);		
   }
}
