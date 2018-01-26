/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stic3.mapping;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Pach
 */
@Entity
@Table(name = "departement")
@NamedQueries({
    @NamedQuery(name = "Departement.findAll", query = "SELECT d FROM Departement d"),
    @NamedQuery(name = "Departement.findByDeptNo", query = "SELECT d FROM Departement d WHERE d.deptNo = :deptNo"),
    @NamedQuery(name = "Departement.findByDeptName", query = "SELECT d FROM Departement d WHERE d.deptName = :deptName"),
    @NamedQuery(name = "Departement.findByLoc", query = "SELECT d FROM Departement d WHERE d.loc = :loc")})
public class Departement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "dept_no")
    private String deptNo;
    @Basic(optional = false)
    @Column(name = "dept_name")
    private String deptName;
    @Basic(optional = false)
    @Column(name = "loc")
    private String loc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "deptNo")
    private List<Employe> employeList;

    public Departement() {
    }

    public Departement(String deptNo) {
        this.deptNo = deptNo;
    }

    public Departement(String deptNo, String deptName, String loc) {
        this.deptNo = deptNo;
        this.deptName = deptName;
        this.loc = loc;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public List<Employe> getEmployeList() {
        return employeList;
    }

    public void setEmployeList(List<Employe> employeList) {
        this.employeList = employeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (deptNo != null ? deptNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departement)) {
            return false;
        }
        Departement other = (Departement) object;
        if ((this.deptNo == null && other.deptNo != null) || (this.deptNo != null && !this.deptNo.equals(other.deptNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "stic3.mapping.Departement[ deptNo=" + deptNo + " ]";
    }
    
}
