package com.hcl.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.stereotype.Service;

import com.hcl.model.Product;
@Service
public class CsvReader {
    private IDataFilter idatafilter;

	public CsvReader(IDataFilter idatafilter) {
		
		this.idatafilter = idatafilter;
	}
	public List<Product> readAndFilterProductsData() throws IOException{
		List<Product> plist=new ArrayList<Product>();
		FileReader fr=new FileReader(new File("Product.txt"));
		//Scanner sc=new Scanner(fr);
		BufferedReader br=new BufferedReader(fr);
		String linedata=br.readLine();
		//String linedata=sc.nextLine();
		while(linedata!=null) {
			String[] split=linedata.split(",");
			String pid=split[0];
			String name=split[1];
			String price=split[2];
			Product p=new Product();
			p.setProductid(Integer.parseInt(pid));
			p.setProductName(name);
			p.setPrice(Double.parseDouble(price));
			plist.add(p);
			//checking next record/second line verification
			linedata=br.readLine();
			//linedata=sc.nextLine();
			
		}
		br.close();
		//sc.close();
		return idatafilter.filterProducts(plist);
	}
  
}
