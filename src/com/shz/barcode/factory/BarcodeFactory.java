package com.shz.barcode.factory;


import com.shz.barcode.beans.BarcodeConfig;
import com.shz.barcode.generator.BarcodeGenerator;
import com.shz.barcode.generator.impl.Barcode128GeneratorImpl;
import com.shz.barcode.generator.impl.Barcode39GeneratorImpl;
import com.shz.barcode.generator.impl.Barcode93GeneratorImpl;
import com.shz.barcode.generator.impl.BarcodeQRGeneratorImpl;
import com.shz.barcode.util.Constants;

public class BarcodeFactory {
	
	public static BarcodeGenerator getInstance(BarcodeConfig barcodeConfig) throws IllegalArgumentException{
		BarcodeGenerator barcodeObj = null;
		if(Constants.CODE_128.equalsIgnoreCase(barcodeConfig.getFormat())){
			barcodeObj = new Barcode128GeneratorImpl(barcodeConfig);
		} else if(Constants.CODE_39.equalsIgnoreCase(barcodeConfig.getFormat())){
			barcodeObj = new Barcode39GeneratorImpl(barcodeConfig);
		} else if(Constants.QR_CODE.equalsIgnoreCase(barcodeConfig.getFormat())){
			barcodeObj = new BarcodeQRGeneratorImpl(barcodeConfig);
		} else if(Constants.CODE_93.equalsIgnoreCase(barcodeConfig.getFormat())){
			barcodeObj = new Barcode93GeneratorImpl(barcodeConfig);
		}else{
			throw new IllegalArgumentException("Barcode Type is not supported: "+ barcodeConfig.getFormat());
		}		
		return barcodeObj;
	}
	
}
