// Generated with g9.

package com.yakoder.moviestore.data.store;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="exp_shipping")
public class ExpenseShipping implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3253605039341342983L;

	/** Primary key. */
    protected static final String PK = "expenseDetailId";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @Column(name="exp_detail_id", unique=true, nullable=false, precision=10)
    private int expenseDetailId;
    @Column(name="postage_cost", precision=15, scale=2)
    private BigDecimal postageCost;
    @Column(name="insurance_cost", precision=15, scale=2)
    private BigDecimal insuranceCost;
    @ManyToOne(optional=false)
    @JoinColumn(name="order_id", nullable=false)
    private Order orders;
    @ManyToOne(optional=false)
    @JoinColumn(name="ship_meth_id", nullable=false)
    private ShippingMethod shippingMethods;

    /** Default constructor. */
    public ExpenseShipping() {
        super();
    }

    /**
     * Access method for expenseDetailId.
     *
     * @return the current value of expenseDetailId
     */
    public int getExpenseDetailId() {
        return expenseDetailId;
    }

    /**
     * Setter method for expenseDetailId.
     *
     * @param aExpenseDetailId the new value for expenseDetailId
     */
    public void setExpenseDetailId(int aExpenseDetailId) {
        expenseDetailId = aExpenseDetailId;
    }

    /**
     * Access method for postageCost.
     *
     * @return the current value of postageCost
     */
    public BigDecimal getPostageCost() {
        return postageCost;
    }

    /**
     * Setter method for postageCost.
     *
     * @param aPostageCost the new value for postageCost
     */
    public void setPostageCost(BigDecimal aPostageCost) {
        postageCost = aPostageCost;
    }

    /**
     * Access method for insuranceCost.
     *
     * @return the current value of insuranceCost
     */
    public BigDecimal getInsuranceCost() {
        return insuranceCost;
    }

    /**
     * Setter method for insuranceCost.
     *
     * @param aInsuranceCost the new value for insuranceCost
     */
    public void setInsuranceCost(BigDecimal aInsuranceCost) {
        insuranceCost = aInsuranceCost;
    }

    /**
     * Access method for orders.
     *
     * @return the current value of orders
     */
    public Order getOrders() {
        return orders;
    }

    /**
     * Setter method for orders.
     *
     * @param aOrders the new value for orders
     */
    public void setOrders(Order aOrders) {
        orders = aOrders;
    }

    /**
     * Access method for shippingMethods.
     *
     * @return the current value of shippingMethods
     */
    public ShippingMethod getShippingMethods() {
        return shippingMethods;
    }

    /**
     * Setter method for shippingMethods.
     *
     * @param aShippingMethods the new value for shippingMethods
     */
    public void setShippingMethods(ShippingMethod aShippingMethods) {
        shippingMethods = aShippingMethods;
    }

    /**
     * Compares the key for this instance with another ExpenseShipping.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ExpenseShipping and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ExpenseShipping)) {
            return false;
        }
        ExpenseShipping that = (ExpenseShipping) other;
        if (this.getExpenseDetailId() != that.getExpenseDetailId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ExpenseShipping.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ExpenseShipping)) return false;
        return this.equalKeys(other) && ((ExpenseShipping)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getExpenseDetailId();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[ExpenseShipping |");
        sb.append(" expenseDetailId=").append(getExpenseDetailId());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("expenseDetailId", Integer.valueOf(getExpenseDetailId()));
        return ret;
    }

}
