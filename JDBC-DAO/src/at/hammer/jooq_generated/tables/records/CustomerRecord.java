/**
 * This class is generated by jOOQ
 */
package at.hammer.jooq_generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CustomerRecord extends org.jooq.impl.UpdatableRecordImpl<at.hammer.jooq_generated.tables.records.CustomerRecord> implements org.jooq.Record13<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = -168107250;

	/**
	 * Setter for <code>chinook.customer.CustomerId</code>. 
	 */
	public void setCustomerid(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>chinook.customer.CustomerId</code>. 
	 */
	public java.lang.Integer getCustomerid() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>chinook.customer.FirstName</code>. 
	 */
	public void setFirstname(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>chinook.customer.FirstName</code>. 
	 */
	public java.lang.String getFirstname() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>chinook.customer.LastName</code>. 
	 */
	public void setLastname(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>chinook.customer.LastName</code>. 
	 */
	public java.lang.String getLastname() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>chinook.customer.Company</code>. 
	 */
	public void setCompany(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>chinook.customer.Company</code>. 
	 */
	public java.lang.String getCompany() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>chinook.customer.Address</code>. 
	 */
	public void setAddress(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>chinook.customer.Address</code>. 
	 */
	public java.lang.String getAddress() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>chinook.customer.City</code>. 
	 */
	public void setCity(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>chinook.customer.City</code>. 
	 */
	public java.lang.String getCity() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>chinook.customer.State</code>. 
	 */
	public void setState(java.lang.String value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>chinook.customer.State</code>. 
	 */
	public java.lang.String getState() {
		return (java.lang.String) getValue(6);
	}

	/**
	 * Setter for <code>chinook.customer.Country</code>. 
	 */
	public void setCountry(java.lang.String value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>chinook.customer.Country</code>. 
	 */
	public java.lang.String getCountry() {
		return (java.lang.String) getValue(7);
	}

	/**
	 * Setter for <code>chinook.customer.PostalCode</code>. 
	 */
	public void setPostalcode(java.lang.String value) {
		setValue(8, value);
	}

	/**
	 * Getter for <code>chinook.customer.PostalCode</code>. 
	 */
	public java.lang.String getPostalcode() {
		return (java.lang.String) getValue(8);
	}

	/**
	 * Setter for <code>chinook.customer.Phone</code>. 
	 */
	public void setPhone(java.lang.String value) {
		setValue(9, value);
	}

	/**
	 * Getter for <code>chinook.customer.Phone</code>. 
	 */
	public java.lang.String getPhone() {
		return (java.lang.String) getValue(9);
	}

	/**
	 * Setter for <code>chinook.customer.Fax</code>. 
	 */
	public void setFax(java.lang.String value) {
		setValue(10, value);
	}

	/**
	 * Getter for <code>chinook.customer.Fax</code>. 
	 */
	public java.lang.String getFax() {
		return (java.lang.String) getValue(10);
	}

	/**
	 * Setter for <code>chinook.customer.Email</code>. 
	 */
	public void setEmail(java.lang.String value) {
		setValue(11, value);
	}

	/**
	 * Getter for <code>chinook.customer.Email</code>. 
	 */
	public java.lang.String getEmail() {
		return (java.lang.String) getValue(11);
	}

	/**
	 * Setter for <code>chinook.customer.SupportRepId</code>. 
	 */
	public void setSupportrepid(java.lang.Integer value) {
		setValue(12, value);
	}

	/**
	 * Getter for <code>chinook.customer.SupportRepId</code>. 
	 */
	public java.lang.Integer getSupportrepid() {
		return (java.lang.Integer) getValue(12);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record13 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row13<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row13) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row13<java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row13) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return at.hammer.jooq_generated.tables.Customer.CUSTOMER.CUSTOMERID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return at.hammer.jooq_generated.tables.Customer.CUSTOMER.FIRSTNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return at.hammer.jooq_generated.tables.Customer.CUSTOMER.LASTNAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return at.hammer.jooq_generated.tables.Customer.CUSTOMER.COMPANY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return at.hammer.jooq_generated.tables.Customer.CUSTOMER.ADDRESS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return at.hammer.jooq_generated.tables.Customer.CUSTOMER.CITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field7() {
		return at.hammer.jooq_generated.tables.Customer.CUSTOMER.STATE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field8() {
		return at.hammer.jooq_generated.tables.Customer.CUSTOMER.COUNTRY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field9() {
		return at.hammer.jooq_generated.tables.Customer.CUSTOMER.POSTALCODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field10() {
		return at.hammer.jooq_generated.tables.Customer.CUSTOMER.PHONE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field11() {
		return at.hammer.jooq_generated.tables.Customer.CUSTOMER.FAX;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field12() {
		return at.hammer.jooq_generated.tables.Customer.CUSTOMER.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field13() {
		return at.hammer.jooq_generated.tables.Customer.CUSTOMER.SUPPORTREPID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getCustomerid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getFirstname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getLastname();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getCompany();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getAddress();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getCity();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value7() {
		return getState();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value8() {
		return getCountry();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value9() {
		return getPostalcode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value10() {
		return getPhone();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value11() {
		return getFax();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value12() {
		return getEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value13() {
		return getSupportrepid();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CustomerRecord
	 */
	public CustomerRecord() {
		super(at.hammer.jooq_generated.tables.Customer.CUSTOMER);
	}

	/**
	 * Create a detached, initialised CustomerRecord
	 */
	public CustomerRecord(java.lang.Integer customerid, java.lang.String firstname, java.lang.String lastname, java.lang.String company, java.lang.String address, java.lang.String city, java.lang.String state, java.lang.String country, java.lang.String postalcode, java.lang.String phone, java.lang.String fax, java.lang.String email, java.lang.Integer supportrepid) {
		super(at.hammer.jooq_generated.tables.Customer.CUSTOMER);

		setValue(0, customerid);
		setValue(1, firstname);
		setValue(2, lastname);
		setValue(3, company);
		setValue(4, address);
		setValue(5, city);
		setValue(6, state);
		setValue(7, country);
		setValue(8, postalcode);
		setValue(9, phone);
		setValue(10, fax);
		setValue(11, email);
		setValue(12, supportrepid);
	}
}
