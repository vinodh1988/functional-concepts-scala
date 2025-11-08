object PartialFunctionExample {

    // Partial function to process Marketing and Research departments
    val processMarketingResearch: PartialFunction[String, String] = {
        case "Marketing" => "Processing Marketing Department"
        case "Research"  => "Processing Research Department"
    }

    // Partial function to process Finance and Manufacturing departments
    val processFinanceManufacturing: PartialFunction[String, String] = {
        case "Finance"       => "Fun2 Processing Finance Department"
        case "Manufacturing" => "Fun2 Processing Manufacturing Department"
    }

    // Composing the partial functions
    val processDepartment: PartialFunction[String, String] =
        processMarketingResearch orElse processFinanceManufacturing

    def main(args: Array[String]): Unit = {
        val departments = List("Marketing", "Finance", "Research", "Manufacturing", "HR")

        departments.foreach { department =>
            if (processDepartment.isDefinedAt(department)) {
                println(processDepartment(department))
            } else {
                println(s"No processing defined for $department Department")
            }
        }
    }
}