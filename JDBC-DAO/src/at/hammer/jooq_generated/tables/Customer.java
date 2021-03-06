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
public class Customer extends org.jooq.impl.TableImpl<at.hammer.jooq_generated.tables.records.CustomerRecord> {

	private static final long serialVersionUID = 621396201;

	/**
	 * The singleton instance of <code>chinook.customer</code>
	 */
	public static final at.hammer.jooq_generated.tables.Customer CUSTOMER = new at.hammer.jooq_generated.tables.Customer();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<at.hammer.jooq_generated.tables.records.CustomerRecord> getRecordType() {
		return at.hammer.jooq_generated.tables.records.CustomerRecord.class;
	}

	/**
	 * The column <code>chinook.customer.CustomerId</code>. 
	 */
	public final org.jooq.TableField<at.hammer.jooq_generated.tables.records.CustomerRecord, java.lang.Integer> CUSTOMERID = createField("CustomerId", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this);

	/**
	 * The column <code>chinook.customer.FirstName</code>. 
	 */
	public final org.jooq.TableField<at.hammer.jooq_generated.tables.records.CustomerRecord, java.lang.String> FIRSTNAME = createField("FirstName", org.jooq.impl.SQLDataType.VARCHAR.length(40).nullable(false), this);

	/**
	 * The column <code>chinook.customer.LastName</code>. 
	 */
	public final org.jooq.TableField<at.hammer.jooq_generated.tables.records.CustomerRecord, java.lang.String> LASTNAME = createField("LastName", org.jooq.impl.SQLDataType.VARCHAR.length(20).nullable(false), this);

	/**
	 * The column <code>chinook.customer.Company</code>. 
	 */
	public final org.jooq.TableField<at.hammer.jooq_generated.tables.records.CustomerRecord, java.lang.String> COMPANY = createField("Company", org.jooq.impl.SQLDataType.VARCHAR.length(80), this);

	/**
	 * The column <code>chinook.customer.Address</code>. 
	 */
	public final org.jooq.TableField<at.hammer.jooq_generated.tables.records.CustomerRecord, java.lang.String> ADDRESS = createField("Address", org.jooq.impl.SQLDataType.VARCHAR.length(70), this);

	/**
	 * The column <code>chinook.customer.City</code>. 
	 */
	public final org.jooq.TableField<at.hammer.jooq_generated.tables.records.CustomerRecord, java.lang.String> CITY = createField("City", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>chinook.customer.State</code>. 
	 */
	public final org.jooq.TableField<at.hammer.jooq_generated.tables.records.CustomerRecord, java.lang.String> STATE = createField("State", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>chinook.customer.Country</code>. 
	 */
	public final org.jooq.TableField<at.hammer.jooq_generated.tables.records.CustomerRecord, java.lang.String> COUNTRY = createField("Country", org.jooq.impl.SQLDataType.VARCHAR.length(40), this);

	/**
	 * The column <code>chinook.customer.PostalCode</code>. 
	 */
	public final org.jooq.TableField<at.hammer.jooq_generated.tables.records.CustomerRecord, java.lang.String> POSTALCODE = createField("PostalCode", org.jooq.impl.SQLDataType.VARCHAR.length(10), this);

	/**
	 * The column <code>chinook.customer.Phone</code>. 
	 */
	public final org.jooq.TableField<at.hammer.jooq_generated.tables.records.CustomerRecord, java.lang.String> PHONE = createField("Phone", org.jooq.impl.SQLDataType.VARCHAR.length(24), this);

	/**
	 * The column <code>chinook.customer.Fax</code>. 
	 */
	public final org.jooq.TableField<at.hammer.jooq_generated.tables.records.CustomerRecord, java.lang.String> FAX = createField("Fax", org.jooq.impl.SQLDataType.VARCHAR.length(24), this);

	/**
	 * The column <code>chinook.customer.Email</code>. 
	 */
	public final org.jooq.TableField<at.hammer.jooq_generated.tables.records.CustomerRecord, java.lang.String> EMAIL = createField("Email", org.jooq.impl.SQLDataType.VARCHAR.length(60).nullable(false), this);

	/**
	 * The column <code>chinook.customer.SupportRepId</code>. 
	 */
	public final org.jooq.TableField<at.hammer.jooq_generated.tables.records.CustomerRecord, java.lang.Integer> SUPPORTREPID = createField("SupportRepId", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * Create a <code>chinook.customer</code> table reference
	 */
	public Customer() {
		super("customer", at.hammer.jooq_generated.Chinook.CHINOOK);
	}

	/**
	 * Create an aliased <code>chinook.customer</code> table reference
	 */
	public Customer(java.lang.String alias) {
		super(alias, at.hammer.jooq_generated.Chinook.CHINOOK, at.hammer.jooq_generated.tables.Customer.CUSTOMER);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<at.hammer.jooq_generated.tables.records.CustomerRecord, java.lang.Integer> getIdentity() {
		return at.hammer.jooq_generated.Keys.IDENTITY_CUSTOMER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.CustomerRecord> getPrimaryKey() {
		return at.hammer.jooq_generated.Keys.KEY_CUSTOMER_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.CustomerRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<at.hammer.jooq_generated.tables.records.CustomerRecord>>asList(at.hammer.jooq_generated.Keys.KEY_CUSTOMER_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.CustomerRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<at.hammer.jooq_generated.tables.records.CustomerRecord, ?>>asList(at.hammer.jooq_generated.Keys.FK_CUSTOMERSUPPORTREPID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public at.hammer.jooq_generated.tables.Customer as(java.lang.String alias) {
		return new at.hammer.jooq_generated.tables.Customer(alias);
	}
}
