// Generated with g9.

package com.yakoder.moviestore.data;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="store_inventory", indexes={@Index(name="store_inventory_store_movie_num_IX", columnList="store_movie_num", unique=true), @Index(name="storeInventoryStoreInventoryInvIdListedIdx", columnList="inv_id,is_listed"), @Index(name="storeInventoryStoreInventoryStoreMovieNumListedIdx", columnList="store_movie_num,is_listed"), @Index(name="storeInventoryStoreInventoryStoreSiteIdListedIdx", columnList="store_site_id,is_listed")})
public class StoreInventory implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8152388737830997831L;

	/** Primary key. */
    protected static final String PK = "storeInvId";

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
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="store_inv_id", unique=true, nullable=false, precision=10)
    private int storeInvId;
    @Column(name="store_movie_num", unique=true, nullable=false, length=100)
    private String storeMovieNum;
    @Column(name="is_listed", nullable=false, length=3)
    private boolean isListed;
    @OneToOne(mappedBy="storeInventory")
    private StoreImportPrep storeImportPrep;
    @ManyToOne(optional=false)
    @JoinColumn(name="inv_id", nullable=false)
    private Inventory inventory;
    @ManyToOne(optional=false)
    @JoinColumn(name="store_site_id", nullable=false)
    private StoreSites storeSites;
    @OneToMany(mappedBy="storeInventory")
    private Set<StoreInvHistory> storeInvHistory;

    /** Default constructor. */
    public StoreInventory() {
        super();
    }

    /**
     * Access method for storeInvId.
     *
     * @return the current value of storeInvId
     */
    public int getStoreInvId() {
        return storeInvId;
    }

    /**
     * Setter method for storeInvId.
     *
     * @param aStoreInvId the new value for storeInvId
     */
    public void setStoreInvId(int aStoreInvId) {
        storeInvId = aStoreInvId;
    }

    /**
     * Access method for storeMovieNum.
     *
     * @return the current value of storeMovieNum
     */
    public String getStoreMovieNum() {
        return storeMovieNum;
    }

    /**
     * Setter method for storeMovieNum.
     *
     * @param aStoreMovieNum the new value for storeMovieNum
     */
    public void setStoreMovieNum(String aStoreMovieNum) {
        storeMovieNum = aStoreMovieNum;
    }

    /**
     * Access method for isListed.
     *
     * @return true if and only if isListed is currently true
     */
    public boolean isIsListed() {
        return isListed;
    }

    /**
     * Setter method for isListed.
     *
     * @param aIsListed the new value for isListed
     */
    public void setIsListed(boolean aIsListed) {
        isListed = aIsListed;
    }

    /**
     * Access method for storeImportPrep.
     *
     * @return the current value of storeImportPrep
     */
    public StoreImportPrep getStoreImportPrep() {
        return storeImportPrep;
    }

    /**
     * Setter method for storeImportPrep.
     *
     * @param aStoreImportPrep the new value for storeImportPrep
     */
    public void setStoreImportPrep(StoreImportPrep aStoreImportPrep) {
        storeImportPrep = aStoreImportPrep;
    }

    /**
     * Access method for inventory.
     *
     * @return the current value of inventory
     */
    public Inventory getInventory() {
        return inventory;
    }

    /**
     * Setter method for inventory.
     *
     * @param aInventory the new value for inventory
     */
    public void setInventory(Inventory aInventory) {
        inventory = aInventory;
    }

    /**
     * Access method for storeSites.
     *
     * @return the current value of storeSites
     */
    public StoreSites getStoreSites() {
        return storeSites;
    }

    /**
     * Setter method for storeSites.
     *
     * @param aStoreSites the new value for storeSites
     */
    public void setStoreSites(StoreSites aStoreSites) {
        storeSites = aStoreSites;
    }

    /**
     * Access method for storeInvHistory.
     *
     * @return the current value of storeInvHistory
     */
    public Set<StoreInvHistory> getStoreInvHistory() {
        return storeInvHistory;
    }

    /**
     * Setter method for storeInvHistory.
     *
     * @param aStoreInvHistory the new value for storeInvHistory
     */
    public void setStoreInvHistory(Set<StoreInvHistory> aStoreInvHistory) {
        storeInvHistory = aStoreInvHistory;
    }

    /**
     * Gets the group fragment invId for member inventory.
     *
     * @return Current value of the group fragment
     * @see Inventory
     */
    public int getInventoryInvId() {
        return (getInventory() == null ? null : getInventory().getInvId());
    }

    /**
     * Sets the group fragment invId from member inventory.
     *
     * @param aInvId New value for the group fragment
     * @see Inventory
     */
    public void setInventoryInvId(int aInvId) {
        if (getInventory() != null) {
            getInventory().setInvId(aInvId);
        }
    }

    /**
     * Gets the group fragment storeSiteId for member storeSites.
     *
     * @return Current value of the group fragment
     * @see StoreSites
     */
    public int getStoreSitesStoreSiteId() {
        return (getStoreSites() == null ? null : getStoreSites().getStoreSiteId());
    }

    /**
     * Sets the group fragment storeSiteId from member storeSites.
     *
     * @param aStoreSiteId New value for the group fragment
     * @see StoreSites
     */
    public void setStoreSitesStoreSiteId(int aStoreSiteId) {
        if (getStoreSites() != null) {
            getStoreSites().setStoreSiteId(aStoreSiteId);
        }
    }

    /**
     * Compares the key for this instance with another StoreInventory.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class StoreInventory and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof StoreInventory)) {
            return false;
        }
        StoreInventory that = (StoreInventory) other;
        if (this.getStoreInvId() != that.getStoreInvId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another StoreInventory.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof StoreInventory)) return false;
        return this.equalKeys(other) && ((StoreInventory)other).equalKeys(this);
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
        i = getStoreInvId();
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
        StringBuffer sb = new StringBuffer("[StoreInventory |");
        sb.append(" storeInvId=").append(getStoreInvId());
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
        ret.put("storeInvId", Integer.valueOf(getStoreInvId()));
        return ret;
    }

}
