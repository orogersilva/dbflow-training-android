package com.orogersilva.dbflowtraining.vo;

import com.orogersilva.dbflowtraining.model.DbFlowDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ManyToMany;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by orogersilva on 3/12/2016.
 */
@Table(database = DbFlowDatabase.class)
@ManyToMany(referencedTable = Product.class)
public class Friend extends BaseModel {

    // region FIELDS

    @PrimaryKey
    private String name;
    @Column
    private double debt;

    // endregion

    // region GETTERS AND SETTERS

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public double getDebt() {

        return debt;
    }

    public void setDebt(double debt) {

        this.debt = debt;
    }

    // endregion
}
