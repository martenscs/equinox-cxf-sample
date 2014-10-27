package net.martenscs.cxf.json;



public class JsonResource implements SimpleResource {

	/*
	 * (non-Javadoc)
	 * 
	 * @see net.martenscs.cxf.json.SimpleResource#createSimpleBean()
	 */

	public TestBean createSimpleBean() {
		return new TestBean("a", 1, 1L);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * net.martenscs.cxf.json.SimpleResource#roundTrip(net.martenscs.cxf.json
	 * .TestBean)
	 */
	public TestBean roundTrip(TestBean s) {
		return s;
	}
}