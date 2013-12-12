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
public class MediatypeRecord extends org.jooq.impl.UpdatableRecordImpl<at.hammer.jooq_generated.tables.records.MediatypeRecord> implements org.jooq.Record2<java.lang.Integer, java.lang.String> {

	private static final long serialVersionUID = -1237923950;

	/**
	 * Setter for <code>chinook.mediatype.MediaTypeId</code>. 
	 */
	public void setMediatypeid(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>chinook.mediatype.MediaTypeId</code>. 
	 */
	public java.lang.Integer getMediatypeid() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>chinook.mediatype.Name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>chinook.mediatype.Name</code>. 
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(1);
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
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> fieldsRow() {
		return (org.jooq.Row2) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.lang.String> valuesRow() {
		return (org.jooq.Row2) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return at.hammer.jooq_generated.tables.Mediatype.MEDIATYPE.MEDIATYPEID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return at.hammer.jooq_generated.tables.Mediatype.MEDIATYPE.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getMediatypeid();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getName();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MediatypeRecord
	 */
	public MediatypeRecord() {
		super(at.hammer.jooq_generated.tables.Mediatype.MEDIATYPE);
	}

	/**
	 * Create a detached, initialised MediatypeRecord
	 */
	public MediatypeRecord(java.lang.Integer mediatypeid, java.lang.String name) {
		super(at.hammer.jooq_generated.tables.Mediatype.MEDIATYPE);

		setValue(0, mediatypeid);
		setValue(1, name);
	}
}