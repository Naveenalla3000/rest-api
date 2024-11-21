package com.naveen.restapi.service

import com.naveen.restapi.entity.BedSheet
import com.naveen.restapi.repo.BedSheetRepo
import org.springframework.stereotype.Service

@Service
class BedSheetServiceImpl(private val bedSheetRepo: BedSheetRepo) : BedSheetService {
    override fun getBedSheets(): List<BedSheet> {
        // TODO("Not yet implemented")
        return bedSheetRepo.findAll()
    }

    override fun getBedSheetById(id: Long): BedSheet = bedSheetRepo.findById(id).orElseThrow { throw RuntimeException("BedSheet not found") }

    override fun addBedSheet(bedSheet: BedSheet): BedSheet {
//        TODO("Not yet implemented")
        return bedSheetRepo.save(bedSheet)
    }

    override fun updateBedSheet(bedSheet: BedSheet): BedSheet = bedSheetRepo.save(bedSheet)
    override fun deleteBedSheet(id: Long) = bedSheetRepo.deleteById(id)

}

