/**
 * This class is generated by jOOQ
 */
package at.hammer.jooq_generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Invoiceline extends org.jooq.impl.TableImpl<at.hammer.jooq_generated.tables.records.InvoicelineRecord> {

	private static final long serialVersionUID = 1073710240;

	/**
	 * The singleton instance of <code>chinook.invoiceline</code>
	 */
	public static final at.hammer.jooq_generated.tables.Invoiceline INVOICELINE = new at.hammer.jooq_generated.tables.Invoiceline();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<at.hammer.jooq_generated.tables.records.InvoicelineRecord> getRecordType() {
		return at.hammer.jooq_generated.tables.records.InvoicelineRecord.class;
	}

	/**
	 * The column <code>chinook.invoiceline.InvoiceLineId</code>. 
	 */
	public final org.jooq.TableField<at.hammer.jooq_generated.tables.records.InvoicelineRecord, java.lang.Integer> INVOICELINEID = createField("InvoiceLineId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>chinook.invoiceline.InvoiceId</code>. 
	 */
	public final org.jooq.TableField<at.hammer.jooq_generated.tables.records.InvoicelineRecord, java.lang.Integer> INVOICEID = createField("InvoiceId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>chinook.invoiceline.TrackId</code>. 
	 */
	public final org.jooq.TableField<at.hammer.jooq_generated.tables.records.InvoicelineRecord, java.lang.Integer> TRACKID = createField("TrackId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>chinook.invoiceline.UnitPrice</code>. 
	 */
	public final org.jooq.TableField<at.hammer.jooq_generated.tables.records.InvoicelineRecord, java.math.BigDecimal> UNITPRICE = createField("UnitPrice", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2).nullable(false), this);

	/**
	 * The column <code>chinook.invoiceline.Quantity</code>. 
	 */
	public final org.jooq.TableField<at.hammer.jooq_generated.tables.records.InvoicelineRecord, java.lang.Integer> QUANTITY = createField("Quantity", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * Create a <code>chinook.invoiceline</code> table reference
	 */
	public Invoiceline() {
		super("invoiceline", at.hammer.jooq_generated.Chinook.CHINOOK);
	}

	/**
	 * Create an aliased <code>chinook.invoiceline</code> table reference
	 */
	public Invoiceline(java.lang.String alias) {
		super(alias, at.hammer.jooq_generated.Chinook.CHINOOK, at.hammer.jooq_generated.tables.Invoiceline.INVOICELINE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<at.hammer.jooq_generated.tables.records.InvoicelineRecord, java.lang.Integer> getIdentity() {
		return at.hammer.jooq_generated.Keys.IDENTITY_INVOICELINE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.InvoicelineRecord> getPrimaryKey() {
		return at.hammer.jooq_generated.Keys.KEY_INVOICELINE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.InvoicelineRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.InvoicelineRecord>>asList(at.hammer.jooq_generated.Keys.KEY_INVOICELINE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.InvoicelineRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.InvoicelineRecord, ?>>asList(at.hammer.jooq_generated.Keys.FK_INVOICELINEINVOICEID, at.hammer.jooq_generated.Keys.FK_INVOICELINETRACKID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public at.hammer.jooq_generated.tables.Invoiceline as(java.lang.String alias) {
		return new at.hammer.jooq_generated.tables.Invoiceline(alias);
	}
}
