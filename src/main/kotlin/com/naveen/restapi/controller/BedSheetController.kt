package com.naveen.restapi.controller

import com.naveen.restapi.entity.BedSheet
import com.naveen.restapi.service.BedSheetService
import com.naveen.restapi.service.BedSheetServiceImpl
import lombok.RequiredArgsConstructor
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/bedsheet")
class BedSheetController(
    private val bedSheetService: BedSheetService
)
{
    @GetMapping(value = ["/getAll"])
    fun getBedSheets(): ResponseEntity<List<BedSheet>> = ResponseEntity.ok(bedSheetService.getBedSheets())

    @GetMapping(value = ["/get/{id}"])
    fun getBedSheetById(@PathVariable id: Long): ResponseEntity<BedSheet> =
        ResponseEntity.ok(bedSheetService.getBedSheetById(id))

    @PostMapping(value = ["/add"])
    fun addBedSheet(@RequestBody bedSheet: BedSheet): ResponseEntity<BedSheet> {
        println(bedSheet.name)
        return ResponseEntity(bedSheetService.addBedSheet(bedSheet), HttpStatus.CREATED)
    }

    @DeleteMapping(value = ["/delete/{id}"])
    fun deleteBedSheet(@PathVariable id: Long): ResponseEntity<Unit> =
        ResponseEntity.ok(bedSheetService.deleteBedSheet(id))

    @PutMapping(value = ["/update/{id}"])
    fun updateBedSheet(@RequestBody bedSheet: BedSheet): ResponseEntity<BedSheet> =
        ResponseEntity.ok(bedSheetService.updateBedSheet(bedSheet))

    @GetMapping(value = ["/test"])
    fun test(): String {
        println("Hello World")
        return "Hello World"
    }
}
