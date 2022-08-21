package br.com.erudio.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exception.UnsuportedMathOperationException;

@RestController
public class MathController {
	
	@Autowired
	MathOperations mO;
	@Autowired
	MathMethodsValidation mMV;
	
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}",method=RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if(!mMV.isNumeric(numberOne) || !mMV.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		return mO.sum(mMV.convertToDouble(numberOne), mMV.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/sub/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double sub(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!mMV.isNumeric(numberOne) || !mMV.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		return mO.sub(mMV.convertToDouble(numberOne), mMV.convertToDouble(numberTwo));	
	}
	
	@RequestMapping(value="/multi/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double multi(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!mMV.isNumeric(numberOne) || !mMV.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		return mO.multi(mMV.convertToDouble(numberOne), mMV.convertToDouble(numberTwo));	
	}
	
	@RequestMapping(value="/div/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double div(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!mMV.isNumeric(numberOne) || !mMV.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		return mO.div(mMV.convertToDouble(numberOne), mMV.convertToDouble(numberTwo));	
	}
	
	@RequestMapping(value="/mean/{numberOne}/{numberTwo}", method=RequestMethod.GET)
	public Double mean(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!mMV.isNumeric(numberOne) || !mMV.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		return mO.mean(mMV.convertToDouble(numberOne), mMV.convertToDouble(numberTwo));	
	}
	
	@RequestMapping(value="/sqrt/{numberOne}", method=RequestMethod.GET)
	public Double sqrt(@PathVariable("numberOne") String numberOne) throws Exception {
		if (!mMV.isNumeric(numberOne)) {
			throw new UnsuportedMathOperationException("Please set a numeric value!");
		}
		return mO.sqrt(mMV.convertToDouble(numberOne));	
	}
	
}
