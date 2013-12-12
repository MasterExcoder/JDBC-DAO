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
public class InvoicelineRecord extends org.jooq.impl.UpdatableRecordImpl<at.hammer.jooq_generated.tables.records.InvoicelineRecord> implements org.jooq.Record5<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.math.BigDecimal, java.lang.Integer> {

	private static final long serialVersionUID = 2126354569;

	/**
	 * Setter for <code>chinook.invoiceline.InvoiceLineId</code>. 
	 */
	public void setInvoicelineid(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>chinook.invoiceline.InvoiceLineId</code>. 
	 */
	public java.lang.Integer getInvoicelineid() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>chinook.invoiceline.InvoiceId</code>. 
	 */
	public void setInvoiceid(java.lang.Integer value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>chinook.invoiceline.InvoiceId</code>. 
	 */
	public java.lang.Integer getInvoiceid() {
		return (java.lang.Integer) getValue(1);
	}

	/**
	 * Setter for <code>chinook.invoiceline.TrackId</code>. 
	 */
	public void setTrackid(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>chinook.invoiceline.TrackId</code>. 
	 */
	public java.lang.Integer getTrackid() {
		return (java.lang.Integer) getValue(2);
	}

	/**
	 * Setter for <code>chinook.invoiceline.UnitPrice</code>. 
	 */
	public void setUnitprice(java.math.BigDecimal value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>chinook.invoiceline.UnitPrice</code>. 
	 */
	public java.math.BigDecimal getUnitprice() {
		return (java.math.BigDecimal) getValue(3);
	}

	/**
	 * Setter for <code>chinook.invoiceline.Quantity</code>. 
	 */
	public void setQuantity(java.lang.Integer value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>chinook.invoiceline.Quantity</code>. 
	 */
	public java.lang.Integer getQuantity() {
		return (java.lang.Integer) getValue(4);
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
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.math.BigDecimal, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row5<java.lang.Integer, java.lang.Integer, java.lang.Integer, java.math.BigDecimal, java.lang.Integer> valuesRow() {
		return (org.jooq.Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return at.hammer.jooq_generated.tables.Invoiceline.INVOICELINE.INVOICELINEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field2() {
		return at.hammer.jooq_generated.tables.Invoiceline.INVOICELINE.INVOICEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return at.hammer.jooq_generated.tables.Invoiceline.INVOICELINE.TRACKID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.math.BigDecimal> field4() {
		return at.hammer.jooq_generated.tables.Invoiceline.INVOICELINE.UNITPRICE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field5() {
		return at.hammer.jooq_generated.tables.Invoiceline.INVOICELINE.QUANTITY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getInvoicelineid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value2() {
		return getInvoiceid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getTrackid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.math.BigDecimal value4() {
		return getUnitprice();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value5() {
		return getQuantity();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached InvoicelineRecord
	 */
	public InvoicelineRecord() {
		super(at.hammer.jooq_generated.tables.Invoiceline.INVOICELINE);
	}

	/**
	 * Create a detached, initialised InvoicelineRecord
	 */
	public InvoicelineRecord(java.lang.Integer invoicelineid, java.lang.Integer invoiceid, java.lang.Integer trackid, java.math.BigDecimal unitprice, java.lang.Integer quantity) {
		super(at.hammer.jooq_generated.tables.Invoiceline.INVOICELINE);

		setValue(0, invoicelineid);
		setValue(1, invoiceid);
		setValue(2, trackid);
		setValue(3, unitprice);
		setValue(4, quantity);
	}
}
