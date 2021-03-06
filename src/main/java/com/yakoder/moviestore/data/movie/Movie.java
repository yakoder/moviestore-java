// Generated with g9.

package com.yakoder.moviestore.data.movie;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

import com.yakoder.moviestore.data.inventory.Inventory;
import com.yakoder.moviestore.data.store.ExpenseMovie;
import com.yakoder.moviestore.data.store.SiteMovie;

@Entity
@Table(name="movies", indexes={@Index(name="moviesMoviesMovieTitleYearIdx", columnList="movie_title,movie_year")})
public class Movie implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -8064505258892389423L;

	/** Primary key. */
    protected static final String PK = "movieId";

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
    @Column(name="movie_id", unique=true, nullable=false, precision=10)
    private int movieId;
    @Column(name="movie_title", nullable=false, length=255)
    private String movieTitle;
    @Column(name="movie_year", precision=10)
    private int movieYear;
    @Column(name="movie_desc", length=255)
    private String movieDesc;
    @Column(name="is_primary", nullable=false, length=3)
    private boolean isPrimary;
    @Column(name="num_title_tracks", precision=10)
    private int numTitleTracks;
    @OneToMany(mappedBy="movies")
    private Set<ExpenseMovie> expenseMovies;
    @OneToMany(mappedBy="movies")
    private Set<Inventory> inventory;
    @OneToMany(mappedBy="aka")
    private Set<MovieAka> movieAkas;
    @OneToMany(mappedBy="primary")
    private Set<MovieAka> primaryMovies;
    @OneToMany(mappedBy="movies")
    private Set<MovieCrew> movieCrew;
    @OneToMany(mappedBy="movie")
    private Set<MovieProductionCompany> movieProductionCompanies;
    @OneToMany(mappedBy="movie")
    private Set<SiteMovie> siteMovies;

    /** Default constructor. */
    public Movie() {
        super();
    }

    /**
     * Access method for movieId.
     *
     * @return the current value of movieId
     */
    public int getMovieId() {
        return movieId;
    }

    /**
     * Setter method for movieId.
     *
     * @param aMovieId the new value for movieId
     */
    public void setMovieId(int aMovieId) {
        movieId = aMovieId;
    }

    /**
     * Access method for movieTitle.
     *
     * @return the current value of movieTitle
     */
    public String getMovieTitle() {
        return movieTitle;
    }

    /**
     * Setter method for movieTitle.
     *
     * @param aMovieTitle the new value for movieTitle
     */
    public void setMovieTitle(String aMovieTitle) {
        movieTitle = aMovieTitle;
    }

    /**
     * Access method for movieYear.
     *
     * @return the current value of movieYear
     */
    public int getMovieYear() {
        return movieYear;
    }

    /**
     * Setter method for movieYear.
     *
     * @param aMovieYear the new value for movieYear
     */
    public void setMovieYear(int aMovieYear) {
        movieYear = aMovieYear;
    }

    /**
     * Access method for movieDesc.
     *
     * @return the current value of movieDesc
     */
    public String getMovieDesc() {
        return movieDesc;
    }

    /**
     * Setter method for movieDesc.
     *
     * @param aMovieDesc the new value for movieDesc
     */
    public void setMovieDesc(String aMovieDesc) {
        movieDesc = aMovieDesc;
    }

    /**
     * Access method for isPrimary.
     *
     * @return true if and only if isPrimary is currently true
     */
    public boolean isIsPrimary() {
        return isPrimary;
    }

    /**
     * Setter method for isPrimary.
     *
     * @param aIsPrimary the new value for isPrimary
     */
    public void setIsPrimary(boolean aIsPrimary) {
        isPrimary = aIsPrimary;
    }

    /**
     * Access method for numTitleTracks.
     *
     * @return the current value of numTitleTracks
     */
    public int getNumTitleTracks() {
        return numTitleTracks;
    }

    /**
     * Setter method for numTitleTracks.
     *
     * @param aNumTitleTracks the new value for numTitleTracks
     */
    public void setNumTitleTracks(int aNumTitleTracks) {
        numTitleTracks = aNumTitleTracks;
    }

    /**
     * Access method for expenseMovies.
     *
     * @return the current value of expenseMovies
     */
    public Set<ExpenseMovie> getExpenseMovies() {
        return expenseMovies;
    }

    /**
     * Setter method for expenseMovies.
     *
     * @param aExpenseMovies the new value for expenseMovies
     */
    public void setExpenseMovies(Set<ExpenseMovie> aExpenseMovies) {
        expenseMovies = aExpenseMovies;
    }

    /**
     * Access method for inventory.
     *
     * @return the current value of inventory
     */
    public Set<Inventory> getInventory() {
        return inventory;
    }

    /**
     * Setter method for inventory.
     *
     * @param aInventory the new value for inventory
     */
    public void setInventory(Set<Inventory> aInventory) {
        inventory = aInventory;
    }

    /**
     * Access method for movieAkas.
     *
     * @return the current value of movieAkas
     */
    public Set<MovieAka> getMovieAkas() {
        return movieAkas;
    }

    /**
     * Setter method for movieAkas.
     *
     * @param aMovieAkas the new value for movieAkas
     */
    public void setMovieAkas(Set<MovieAka> aMovieAkas) {
        movieAkas = aMovieAkas;
    }

    /**
     * Access method for primaryMovies.
     *
     * @return the current value of primaryMovies
     */
    public Set<MovieAka> getPrimaryMovies() {
        return primaryMovies;
    }

    /**
     * Setter method for primaryMovies.
     *
     * @param aPrimaryMovies the new value for primaryMovies
     */
    public void setPrimaryMovies(Set<MovieAka> aPrimaryMovies) {
        primaryMovies = aPrimaryMovies;
    }

    /**
     * Access method for movieCrew.
     *
     * @return the current value of movieCrew
     */
    public Set<MovieCrew> getMovieCrew() {
        return movieCrew;
    }

    /**
     * Setter method for movieCrew.
     *
     * @param aMovieCrew the new value for movieCrew
     */
    public void setMovieCrew(Set<MovieCrew> aMovieCrew) {
        movieCrew = aMovieCrew;
    }

    /**
     * Access method for movieProductionCompanies.
     *
     * @return the current value of movieProductionCompanies
     */
    public Set<MovieProductionCompany> getMovieProductionCompanies() {
        return movieProductionCompanies;
    }

    /**
     * Setter method for movieProductionCompanies.
     *
     * @param aMovieProductionCompanies the new value for movieProductionCompanies
     */
    public void setMovieProductionCompanies(Set<MovieProductionCompany> aMovieProductionCompanies) {
        movieProductionCompanies = aMovieProductionCompanies;
    }

    /**
     * Access method for siteMovies.
     *
     * @return the current value of siteMovies
     */
    public Set<SiteMovie> getSiteMovies() {
        return siteMovies;
    }

    /**
     * Setter method for siteMovies.
     *
     * @param aSiteMovies the new value for siteMovies
     */
    public void setSiteMovies(Set<SiteMovie> aSiteMovies) {
        siteMovies = aSiteMovies;
    }

    /**
     * Compares the key for this instance with another Movies.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Movies and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Movie)) {
            return false;
        }
        Movie that = (Movie) other;
        if (this.getMovieId() != that.getMovieId()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Movies.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Movie)) return false;
        return this.equalKeys(other) && ((Movie)other).equalKeys(this);
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
        i = getMovieId();
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
        StringBuffer sb = new StringBuffer("[Movies |");
        sb.append(" movieId=").append(getMovieId());
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
        ret.put("movieId", Integer.valueOf(getMovieId()));
        return ret;
    }

}
