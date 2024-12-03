package com.ryanbalseiro.nycschoolsapp.Model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SchoolDataItem(
    val academicopportunities1: String,
    val academicopportunities2: String,
    val academicopportunities3: String,
    val academicopportunities4: String,
    val academicopportunities5: String,
    val addtl_info1: String,
    val admissionspriority11: String,
    val admissionspriority110: String,
    val admissionspriority12: String,
    val admissionspriority13: String,
    val admissionspriority14: String,
    val admissionspriority15: String,
    val admissionspriority16: String,
    val admissionspriority17: String,
    val admissionspriority18: String,
    val admissionspriority19: String,
    val admissionspriority21: String,
    val admissionspriority22: String,
    val admissionspriority23: String,
    val admissionspriority24: String,
    val admissionspriority25: String,
    val admissionspriority26: String,
    val admissionspriority27: String,
    val admissionspriority28: String,
    val admissionspriority29: String,
    val admissionspriority31: String,
    val admissionspriority32: String,
    val admissionspriority33: String,
    val admissionspriority34: String,
    val admissionspriority35: String,
    val admissionspriority36: String,
    val admissionspriority37: String,
    val admissionspriority41: String,
    val admissionspriority42: String,
    val admissionspriority43: String,
    val admissionspriority44: String,
    val admissionspriority46: String,
    val admissionspriority51: String,
    val admissionspriority52: String,
    val admissionspriority53: String,
    val admissionspriority54: String,
    val admissionspriority56: String,
    val admissionspriority61: String,
    val admissionspriority62: String,
    val admissionspriority63: String,
    val admissionspriority64: String,
    val admissionspriority71: String,
    val admissionspriority74: String,
    val advancedplacement_courses: String,
    val applicants1specialized: String,
    val applicants2specialized: String,
    val applicants3specialized: String,
    val applicants4specialized: String,
    val applicants5specialized: String,
    val applicants6specialized: String,
    val appperseat1specialized: String,
    val appperseat2specialized: String,
    val appperseat3specialized: String,
    val appperseat4specialized: String,
    val appperseat5specialized: String,
    val appperseat6specialized: String,
    val attendance_rate: String,
    val auditioninformation1: String,
    val auditioninformation2: String,
    val auditioninformation3: String,
    val auditioninformation4: String,
    val auditioninformation5: String,
    val auditioninformation6: String,
    val auditioninformation7: String,
    val bbl: String,
    val bin: String,
    val boro: String,
    val borough: String,
    val boys: String,
    val building_code: String,
    val bus: String,
    val campus_name: String,
    val census_tract: String,
    val city: String,
    val code1: String,
    val code10: String,
    val code2: String,
    val code3: String,
    val code4: String,
    val code5: String,
    val code6: String,
    val code7: String,
    val code8: String,
    val code9: String,
    val college_career_rate: String,
    val common_audition1: String,
    val common_audition2: String,
    val common_audition3: String,
    val common_audition4: String,
    val common_audition5: String,
    val common_audition6: String,
    val common_audition7: String,
    val community_board: String,
    val council_district: String,
    val dbn: String,
    val diplomaendorsements: String,
    val directions1: String,
    val directions2: String,
    val directions3: String,
    val directions4: String,
    val directions5: String,
    val directions6: String,
    val directions7: String,
    val earlycollege: String,
    val eligibility1: String,
    val eligibility2: String,
    val eligibility3: String,
    val eligibility4: String,
    val eligibility5: String,
    val eligibility6: String,
    val eligibility7: String,
    val ell_programs: String,
    val end_time: String,
    val extracurricular_activities: String,
    val fax_number: String,
    val finalgrades: String,
    val geoeligibility: String,
    val girls: String,
    val grade9geapplicants1: String,
    val grade9geapplicants10: String,
    val grade9geapplicants2: String,
    val grade9geapplicants3: String,
    val grade9geapplicants4: String,
    val grade9geapplicants5: String,
    val grade9geapplicants6: String,
    val grade9geapplicants7: String,
    val grade9geapplicants8: String,
    val grade9geapplicants9: String,
    val grade9geapplicantsperseat1: String,
    val grade9geapplicantsperseat10: String,
    val grade9geapplicantsperseat2: String,
    val grade9geapplicantsperseat3: String,
    val grade9geapplicantsperseat4: String,
    val grade9geapplicantsperseat5: String,
    val grade9geapplicantsperseat6: String,
    val grade9geapplicantsperseat7: String,
    val grade9geapplicantsperseat8: String,
    val grade9geapplicantsperseat9: String,
    val grade9gefilledflag1: String,
    val grade9gefilledflag10: String,
    val grade9gefilledflag2: String,
    val grade9gefilledflag3: String,
    val grade9gefilledflag4: String,
    val grade9gefilledflag5: String,
    val grade9gefilledflag6: String,
    val grade9gefilledflag7: String,
    val grade9gefilledflag8: String,
    val grade9gefilledflag9: String,
    val grade9swdapplicants1: String,
    val grade9swdapplicants10: String,
    val grade9swdapplicants2: String,
    val grade9swdapplicants3: String,
    val grade9swdapplicants4: String,
    val grade9swdapplicants5: String,
    val grade9swdapplicants6: String,
    val grade9swdapplicants7: String,
    val grade9swdapplicants8: String,
    val grade9swdapplicants9: String,
    val grade9swdapplicantsperseat1: String,
    val grade9swdapplicantsperseat10: String,
    val grade9swdapplicantsperseat2: String,
    val grade9swdapplicantsperseat3: String,
    val grade9swdapplicantsperseat4: String,
    val grade9swdapplicantsperseat5: String,
    val grade9swdapplicantsperseat6: String,
    val grade9swdapplicantsperseat7: String,
    val grade9swdapplicantsperseat8: String,
    val grade9swdapplicantsperseat9: String,
    val grade9swdfilledflag1: String,
    val grade9swdfilledflag10: String,
    val grade9swdfilledflag2: String,
    val grade9swdfilledflag3: String,
    val grade9swdfilledflag4: String,
    val grade9swdfilledflag5: String,
    val grade9swdfilledflag6: String,
    val grade9swdfilledflag7: String,
    val grade9swdfilledflag8: String,
    val grade9swdfilledflag9: String,
    val grades2018: String,
    val graduation_rate: String,
    val interest1: String,
    val interest10: String,
    val interest2: String,
    val interest3: String,
    val interest4: String,
    val interest5: String,
    val interest6: String,
    val interest7: String,
    val interest8: String,
    val interest9: String,
    val international: String,
    val language_classes: String,
    val latitude: String,
    val location: String,
    val longitude: String,
    val method1: String,
    val method10: String,
    val method2: String,
    val method3: String,
    val method4: String,
    val method5: String,
    val method6: String,
    val method7: String,
    val method8: String,
    val method9: String,
    val neighborhood: String,
    val nta: String,
    val offer_rate1: String,
    val offer_rate2: String,
    val offer_rate3: String,
    val offer_rate4: String,
    val offer_rate5: String,
    val offer_rate6: String,
    val offer_rate7: String,
    val offer_rate8: String,
    val offer_rate9: String,
    val overview_paragraph: String,
    val pbat: String,
    val pct_stu_enough_variety: String,
    val pct_stu_safe: String,
    val phone_number: String,
    val prgdesc1: String,
    val prgdesc10: String,
    val prgdesc2: String,
    val prgdesc3: String,
    val prgdesc4: String,
    val prgdesc5: String,
    val prgdesc6: String,
    val prgdesc7: String,
    val prgdesc8: String,
    val prgdesc9: String,
    val primary_address_line_1: String,
    val program1: String,
    val program10: String,
    val program2: String,
    val program3: String,
    val program4: String,
    val program5: String,
    val program6: String,
    val program7: String,
    val program8: String,
    val program9: String,
    val psal_sports_boys: String,
    val psal_sports_coed: String,
    val psal_sports_girls: String,
    val ptech: String,
    val requirement1_1: String,
    val requirement1_2: String,
    val requirement1_3: String,
    val requirement1_4: String,
    val requirement1_5: String,
    val requirement1_6: String,
    val requirement1_7: String,
    val requirement1_8: String,
    val requirement2_1: String,
    val requirement2_2: String,
    val requirement2_3: String,
    val requirement2_4: String,
    val requirement2_5: String,
    val requirement2_6: String,
    val requirement2_7: String,
    val requirement2_8: String,
    val requirement3_1: String,
    val requirement3_2: String,
    val requirement3_3: String,
    val requirement3_4: String,
    val requirement3_5: String,
    val requirement3_6: String,
    val requirement3_7: String,
    val requirement3_8: String,
    val requirement4_1: String,
    val requirement4_2: String,
    val requirement4_3: String,
    val requirement4_4: String,
    val requirement4_5: String,
    val requirement4_6: String,
    val requirement4_7: String,
    val requirement5_1: String,
    val requirement5_2: String,
    val requirement5_3: String,
    val requirement5_4: String,
    val requirement5_5: String,
    val requirement5_6: String,
    val requirement5_7: String,
    val requirement6_1: String,
    val requirement6_2: String,
    val requirement6_3: String,
    val requirement6_7: String,
    val school_10th_seats: String,
    val school_accessibility_description: String,
    val school_email: String,
    val school_name: String,
    val school_sports: String,
    val seats101: String,
    val seats1010: String,
    val seats102: String,
    val seats103: String,
    val seats104: String,
    val seats105: String,
    val seats106: String,
    val seats107: String,
    val seats108: String,
    val seats109: String,
    val seats1specialized: String,
    val seats2specialized: String,
    val seats3specialized: String,
    val seats4specialized: String,
    val seats5specialized: String,
    val seats6specialized: String,
    val seats9ge1: String,
    val seats9ge10: String,
    val seats9ge2: String,
    val seats9ge3: String,
    val seats9ge4: String,
    val seats9ge5: String,
    val seats9ge6: String,
    val seats9ge7: String,
    val seats9ge8: String,
    val seats9ge9: String,
    val seats9swd1: String,
    val seats9swd10: String,
    val seats9swd2: String,
    val seats9swd3: String,
    val seats9swd4: String,
    val seats9swd5: String,
    val seats9swd6: String,
    val seats9swd7: String,
    val seats9swd8: String,
    val seats9swd9: String,
    val shared_space: String,
    val specialized: String,
    val start_time: String,
    val state_code: String,
    val subway: String,
    val total_students: String,
    val transfer: String,
    val website: String,
    val zip: String
): Parcelable