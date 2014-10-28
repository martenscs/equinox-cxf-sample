package net.martenscs.cxf.contract.doubleit;

import javax.jws.WebService;
import net.martenscs.cxf.contract.doubleit.DoubleItPortType;

@WebService(targetNamespace = "http://cxf.martenscs.net/contract/DoubleIt", portName = "DoubleItPort", serviceName = "DoubleItService", endpointInterface = "net.martenscs.cxf.contract.doubleit.DoubleItPortType")
public class DoubleItPortTypeImpl implements DoubleItPortType {

	public int doubleIt(int numberToDouble) {
		return numberToDouble * 2;
	}
}
