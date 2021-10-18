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
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="prod_cos")
public class ProdCos implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -5068396319082401320L;

	/** Primary key. */
    protected static final String PK = "prodCoId";

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
    @Column(name="prod_co_id", unique=true, nullable=false, precision=10)
    private int prodCoId;
    @Column(name="prod_co_name", nullable=false, length=100)
    private String prodCoName;
    @Column(name="prod_co_url", length=255)
    private String prodCoUrl;
    @OneToMany(mappedBy="prodCos")
    private Set<MovieProdCos> movieProdCos;

    /** Default constructor. */
    public ProdCos() {
        super();
    }

    /**
     * Access method for prodCoId.
     *
     * @return the current value of prodCoId
     */
    public int getProdCoId() {
        return prodCoId;
    }

    /**
     * Setter method for prodCoId.
     *
     * @param aProdCoId the new value for prodCoId
     */
    public void setProdCoId(int aProdCoId) {
        prodCoId = aProdCoId;
    }

    /**
     * Access method for prodCoName.
     *
     * @return the current value of prodCoName
     */
    public String getProdCoName() {
        return prodCoName;
    }

    /**
     * Setter method for prodCoName.
     *
     * @param aProdCoName the new value for prodCoName
     */
    public void setProdCoName(String aProdCoName) {
        prodCoName = aProdCoName;
    }

    /**
     * Access method for prodCoUrl.
     *
     * @return the current value of prodCoUrl
     */
    public String getProdCoUrl() {
        return prodCoUrl;
    }

    /**
     * Setter method for prodCoUrl.
     *
     * @param aProdCoUrl the new value for prodCoUrl
     */
    public void setProdCoUrl(String aProdCoUrl) {
        prodCoUrl = aProdCoUrl;
    }

    /**
     * Access method for movieProdCos.
     *
     * @return the current value of movieProdCos
     */
    public Set<MovieProdCos> getMovieProdCos() {
        return movieProdCos;
    }

    /**
     * Setter method for movieProdCos.
     *
     * @param aMovieProdCos the new value for movieProdCos
     */
    public void setMovieProdCos(Set<MovieProdCos> aMovieProdCos) {
        movieProdCos = aMovieProdCos;
    }

    /**
     * Compares the key for this instance with another ProdCos.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class ProdCos and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof ProdCos)) {
            return false;
        }
        ProdCos that = (ProdCos) other;
        if (this.getProdCoId() != that.getProdCoId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another ProdCos.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof ProdCos)) return false;
        return this.equalKeys(other) && ((ProdCos)other).equalKeys(this);
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
        i = getProdCoId();
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
        StringBuffer sb = new StringBuffer("[ProdCos |");
        sb.append(" prodCoId=").append(getProdCoId());
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
        ret.put("prodCoId", Integer.valueOf(getProdCoId()));
        return ret;
    }

}