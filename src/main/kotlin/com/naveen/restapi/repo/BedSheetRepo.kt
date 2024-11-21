package com.naveen.restapi.repo

import com.naveen.restapi.entity.BedSheet
import org.springframework.data.jpa.repository.JpaRepository
import java.io.Serializable

interface BedSheetRepo : JpaRepository<BedSheet,Serializable>
