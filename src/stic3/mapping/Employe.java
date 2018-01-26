/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stic3.mapping;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Pach
 */
@Entity
@Table(name = "employe")
@NamedQueries({
    @NamedQuery(name = "Employe.findAll", query = "SELECT e FROM Employe e"),
    @NamedQuery(name = "Employe.findByEmpNo", query = "SELECT e FROM Employe e WHERE e.empNo = :empNo"),
    @NamedQuery(name = "Employe.findByEname", query = "SELECT e FROM Employe e WHERE e.ename = :ename"),
    @NamedQuery(name = "Employe.findByJob", query = "SELECT e FROM Employe e WHERE e.job = :job"),
    @NamedQuery(name = "Employe.findByMrg", query = "SELECT e FROM Employe e WHERE e.mrg = :mrg"),
    @NamedQuery(name = "Employe.findByHiredate", query = "SELECT e FROM Employe e WHERE e.hiredate = :hiredate"),
    @NamedQuery(name = "Employe.findBySal", query = "SELECT e FROM Employe e WHERE e.sal = :sal"),
    @NamedQuery(name = "Employe.findByComm", query = "SELECT e FROM Employe e WHERE e.comm = :comm")})
public class Employe implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "emp_no")
    private String empNo;
    @Basic(optional = false)
    @Column(name = "ename")
    private String ename;
    @Basic(optional = false)
    @Column(name = "job")
    private String job;
    @Basic(optional = false)
    @Column(name = "mrg")
    private String mrg;
    @Basic(optional = false)
    @Column(name = "hiredate")
    @Temporal(TemporalType.DATE)
    private Date hiredate;
    @Basic(optional = false)
    @Column(name = "sal")
    private String sal;
    @Basic(optional = false)
    @Column(name = "comm")
    private String comm;
    @JoinColumn(name = "dept_no", referencedColumnName = "dept_no")
    @ManyToOne(optional = false)
    private Departement deptNo;

    public Employe() {
    }

    public Employe(String empNo) {
        this.empNo = empNo;
    }

    public Employe(String empNo, String ename, String job, String mrg, Date hiredate, String sal, String comm) {
        this.empNo = empNo;
        this.ename = ename;
        this.job = job;
        this.mrg = mrg;
        this.hiredate = hiredate;
        this.sal = sal;
        this.comm = comm;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getMrg() {
        return mrg;
    }

    public void setMrg(String mrg) {
        this.mrg = mrg;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm;
    }

    public Departement getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(Departement deptNo) {
        this.deptNo = deptNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empNo != null ? empNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employe)) {
            return false;
        }
        Employe other = (Employe) object;
        if ((this.empNo == null && other.empNo != null) || (this.empNo != null && !this.empNo.equals(other.empNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "stic3.mapping.Employe[ empNo=" + empNo + " ]";
    }
    
}
