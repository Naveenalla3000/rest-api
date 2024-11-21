package com.naveen.restapi.service

import com.naveen.restapi.entity.BedSheet

interface BedSheetService {
    fun getBedSheets(): List<BedSheet>
    fun getBedSheetById(id: Long): BedSheet
    fun addBedSheet(bedSheet: BedSheet): BedSheet
    fun updateBedSheet(bedSheet: BedSheet): BedSheet
    fun deleteBedSheet(id: Long)
}