# W02

## 任务一

### 1.

类图：

![](http://www.plantuml.com/plantuml/png/NPBFKiCW4CRlF0L7wZIluDHUl7ZeMFNYU2396XafP61HQ_JTvGyqO2ui7xk_vLkoiyWDkfCaP93SMdhK1i4iXFhlGukHIir79XG-lsnMqMg3BEsFQ8IQw0Hua5nvyRUWzgxl9TJ0YA6yhfibLnNtay-XsJQaLgXRWEy2iSXH35cY-0Of2cVvzl5wMMcp9y27Ki1gFu2fbAMbiIQ5WiUPtVcbrhsJcHiBqNQIAY9ymU0Goi5gnMDuBs5fcX-q5IYqOYL8fBAZKvMoAQCCwXEN3bWzAUtCcE2llfECYMPBfotjM-QSWsPCeJfmOx0_ttFr7jvZxMc2icbVx7ArMDLwXQNf6eQMGxj2PeSipoMyV6wNbN0Tzb_q7DGtnl1pRRvqMPfwcTPcuFciT8sC-d-bNVTpJLDCegsav7mIdD6hhhkq92MWsgibBVrfHMhs3LlN9B83DRgJ_0C0)

时序图：

![](http://www.plantuml.com/plantuml/png/RPFFRjD04CRl-nGhvSmB-80gBZqIgU81h6HnBRdUi5whm2cehPMqJHfQXV2d0e8ABOMcaNeWX0HUnhjsJdq5PZDjR4Uv94xyVR_zPcPdBP2saE6MHqY5UnwhI9Vx0Or7E_7eCdtz8zt_fYvsg1rGXuUYIfw5B6IKBWkIzxkwVQmQFMgar7DzHkoAv0AaQVrLF1vJYg_a9bjdx2KpRqgFXUqx34xsfU0UDOZnqRqou48QMMbTCEOJvajNlg16D7lxAVbpeZ-Utaizxj3I8oza2rKoUQEYTqNLjd0HM0v5pME449EJFdY8jL6Bra99V2uPzTXJQL4rZ9RgL7iDE5ytEl6edlOF2SdA0Gmc1ax0vCRyEQEHMRsf3xvZYScWfs-wv7RIKD6nlkdZlxUJ9kIl6iiIsEIqvfzFQeWKhhCf2RPMNVzU12JflmyG39kKqJ1P3iNjQWu4fUv_JgTJtHtgrY0lnoVBV1TQWyTWxbLwXycoP_i5I_kN-jj32mvcPVjW2hO8sB8RYaIhFcpggw-poxEx20UHQaHBfCKFYxBdh19AbaVfvZaO4L8quaM0QhVjMfa7hbc6p4a9d9tidTyvyst7BF6qbKm7yVXCjxvalJSTpx4btv32zPrY-uUHwkpcRvfkdgZMK9rUm1nXh-BH5P2uaurm1OSIuEZh8xYS-cSVSs0crMd3YYAAf8EXcdO1ZLC0T1OMTsH-2dSiN9b2qlnY4R86nd3B-my0)

### 2.

好处：

（1）将各个实现上无紧密联系的类型进行分割，而不是像面向过程一样把一堆函数放在一起，面向对象的编码使得代码的阅读更加轻松并且同一类的成员函数逻辑联系更加紧密；

（2）使用面向对象式的编程方法设计类的时候更像设计一个个人或物体，并赋予该人或物体独特的方法来区分，就像现实生活一样拥有着自己独一无二的行动和技能，用面向对象设计时就好比是将该人或物体当作一个个对象，并使这些对象之间通过自己的行为来发生关系，进行人际交往，就像现实生活中的行动一般；

（3）通过每个对象的行为，可以进行追踪，来得出运行时的一系列运动轨迹，以便去理解运行时的逻辑来对整个代码的思路和逻辑有所了解；

（4）Sorter和Linable都只提供了接口，而实现部分由其他的类来实现，这样子可以确保多态的实现，且在忘了赋予其所属实现方式时可以及时发现，提升了程序的鲁棒性。

可改进之处：

（1）将成员变量和成员函数分别放在一起，便于阅读，否则可能会疏忽成员变量。

（2）将Line中的嵌套类Position的定义放在前面，以便用到Position时可以方便地找到类的位置来查看定义。

（3）Geezer类中的成员函数execute可以再加一个判断条件来判断couple数组是否为空，因为如果为空的话则parseInt数组就无法实施，会进行报错，couple数组为空的条件是排序算法没有进行过一次交换位置，则获得的plan字符串为空，最后的couple也为空。虽然example示例里的葫芦娃的顺序是固定打乱的，所以plan和couple一定不会为空从而不产生报错；但如果是采取随机分布，且一开始就已经排好顺序了（即不会交换位置），则有可能产生报错，从而使程序的鲁棒性降低。所以如果是为了使程序更具有适用性，应该在swapPosition前加一个判定条件——couple不为空。

## 任务二(排序选择根据颜色的灰度来排序)

类图：

![](http://www.plantuml.com/plantuml/png/hLHDZzCm4BtdLupsvABs5rIWfKYS5cdPmccr1oSPWeKR1tyiMmh_dN5if-EgtBPIvV7pcpUJDqvkdPVMXuDkcavBvs1lh4TxQe1-pqRre8tiXHhzuzFZq-eCE-A9jDzxgyO11lJtMeu4_YrYkz2s6hba5WB9CoTAOyg_v1GBhYEPYUrHO-TVIUnpKDsFgrhRUTkRG9tJVh3oU8VFgBUNHU0jtDni_rjgmN-MKjVws1ddKWFEIw-w6G3_7UCwuwb9SFDooOocVqbamOU3sIUHbcfEMetuTH9tj72SddMIrk4ymmGnHNp1BdZC1-m1I4QIKwUg-BrnoYipYX8afRA3WL5MP_iZ_i5eO_aT-cH6jqpf6rNJaGns3SCQsXeb2Jkqt2G2wT_Z2mUp9B4FAN9rUrCEcYj9iSSSxewfsRdmghu8o-DbRkqOdgg2qVeSkhFC5Bp8xh8hbP7OXhW4ISURzvPkB3UmL3bL-JgjrTZoMQdADAZQmz2oDuKv_L5ff17KMf4kLZK_WxMg77jpOCBWJB0T5W2S-etiT4bvG9Ua-6S1Dfi_xo353Vlur0VitQ_mFAg4PGyQMX7UR3QBZKq9m11QQ2NNS6PyBGiBbrqfrzpYs8U3_WS0)

时序图：

![](http://www.plantuml.com/plantuml/png/RLJ1Jjj04BtlLup4fLNffL9xyA52N3XLYeBw0IRP6gl6czfhqTvoW92KX4IbWG8HBOYMWY2aL6f38F0psRNp5nrx7SUXNEAnT-QzDpClE-DotU7UaaL8ZbaMpN6JsIuyU_vYq3qLdReideBkmX9-vDGXxppgKO29StztHMvy4kLj23F1CcrAz1nd3kO5Usl-vIs0EkABT9Qv6C1KbkQHqEOEio2ixjL7IIvpa0bJvXnARK9jRl8F0DcvsU5XAwXSHacEiG1J6TD-cvmFT-korPFD3gW4tSwpfH25MVaa2Pc6NxxwrvjolpNYivW1KxEMHvCi_sPBb7OcivOTKwdAU4x1eeI42fw-38Leu5AUnTSdu4G1iHcdOD4tN8DWuw-eRuchFy7TPx6t7vwIM1jMgqW30-kYC4lT_wkJrd1AE6P238Tv1H2T4iA9ueqw5-MIVxqZgskYlOihKRiX06fOAR8Ohjv0Q3NIA2jUSTAKJPVXbVhso9asfXSUHscHEiSq5ddqYY86tPfeL1KI4kEYefD4rN2rXi9IUgYT3r48FWa9xOAS2Rq61O-dPu0CQRU9rJ9kKPORWsunEAWI4fiACKRMYHOo7yLZ838iLkJwYVAQtzwMlvia5ZA14UhHej_N1P9gLZbPN5o97rieOt1zHeAxFLIWF3N6KY9IK4pFfu2meO_VWduVrobhxNIwYhJecHw0eb727yf7ysGitRxlczjjLQ9y_C2SSDAwuzBxjTYYAfJLYZp_FZmzYWMibt2P4pXng05zJtCUfsaOMJd68WKmBXel6ljSrWiPvfhSP2a1G8BsIJ9ZrE2l7iSeIiUWN_FxxK7lIDOEawdVjv46dCrpnxIDz0xHIgAnWbPI-6ZMsF-AHlGtHQKsFEXXyufB_6hwHxqK2pD6YtsG0K8AUL57Rygp0wLHwHMD3QH3euH_uA3T4VscQFrKknbqpySKwgA9M9YXGVIQji_4xKJ831RYxVqF)

可视化结果链接：

[![asciicast](https://asciinema.org/a/438514.svg)](https://asciinema.org/a/438514)

## 任务三(排序选择根据图片进行左右翻转后对应的位置进行排序)

类图：

![](http://www.plantuml.com/plantuml/png/hLJ1aXCX4BtFLt0aLl8Brfg39xTgJTIBvO7Cj2Er38mqusQD_hj0CsoJoitDXPv7ztjDly0T1kN3Cfckwur254Vd0_XB9-BlbzE3C4uDKjlmzTlc1SIO9Udx6BosenWXF1Xb8_XtfTelfvC1JfXfX5Vs4Ndj70iPzvEQa-0sfJEw8nZemwlHVLnq__Y_R1N_kRBTajexHDB0e8BkCo323qXhngaFWNcvpaop_KJ9adi0PHYIbiQEISNr_7cMzpdWU_6Gi_88sIw262kSeLy2b0rsY0_QgcZdfMdWmQ4Esbcv1iIqVecHfMpMAIVqYp8BI4P_xonMAxv7BPDJ_LQCMt7YADaqNc7PE3QvZ6axm9c3HIKIJ1HXs-zSWkv6KMgxXFldGrIJsUNchr4FMnBP0Sc8IwENh2WXrkbuzxGLlJClpFCIP1d_LhH_lWAdtkJDdIWHt3llrJERTctWqf0OMXk7ozwgppYYv64yiRj3jk3Do_HU6uXcDUIvNcvQWYkGe3njBfsXmKtyvg9RV0zrZAX_0zkj9GT0ekBlYTZj_hmL57VitMets9FHu6HsmSgWEl9RlDdjwhIxDH0keYMnLZkUcIvxHeYcVg-ItHtOOPdCFm00)

时序图：

![](http://www.plantuml.com/plantuml/png/RLJ1Rjj64BtlLmpWIzgwXnIe3pmKWIyv5J0Kz0COQyiGeRWgkOJJcm-9OpMI9IIndTX24WTkKnk9egPeAyjHyZFS9VaN7UrGr2hMQPUScVVUp3poHYpTI2QDWB5D4GHyK_eYZE6xxzVIqRaQTlNsERWnDF2bv17x9U491rY8PqVtivTdnRD_O9e93LT6_ZtcRaeHOMP-_33xy0c0Wl8ENnSnNc2bnkj86Sf81A3t7gjnTvOKYmYvCELcn7d8U2Xz-Ij0xUPwyRgVjpwOfCYx3IiRVdYtYXT7NTqVw_qXK88RraLZYYA2UfM4JCMpbzdb4_sYF-CBX0Shwq72gwpiuu7QURwOjHNvf6eZYPe1PsoguDiV00y7OYvh-FWDHER2GY4v1FndwK2-zv_g7gYBV_FFJzNn2umkb9eA5zkmIYYJcbNlBzJuASxO9B6oAooccmCUrfjhZSTNUQkXu7pLxY5ZNYII9gZX3WfHsnyfhdPtiildklrG3OwGYlRA06ZC5ba9r-qXDEapMQKzgfv2lWK_qhjhqIfugt1xTOfnzokJRbH6ldT7caSKauuwgjScH1I0grQFsoQOZlQM30ALcsWbltZGmGuiuJoiJsaOdeoH9r5UfTI1PYBdusAemVOqGv_etTxrjQ-lhrN-PZDCLjeO0MTcDHQuPUuMQh7Tqe_EoDtPu53_lRyKW-GvvVbJara3ekzdslmV1oWilNpByi_7-KcRd3p78o4sN23SkWNbWFhjLJwPe1bqPs0NqCqnfsqX8YBvr_Ih2oohcIKkgKKRRWHk-AK3FnrIENrBIoQ7Yt2Zc7zPYmrJeMwtzBlVY_FJKioZ7Tps0avvTO3Vuvk9v3QCRht18WAmYiW7rFEMszmGiIzzOGa0bW_EgecZXkp1cnA5TAIJJZOPfEDJtNbTxU2gpnoGuXQ-2prxfsWsrRkFPYC6D5ZvBH6HcZnHhKvnCiRsYKtzjP-TZkSyWV3iHI_XW2c9VjzDHzlwxGdf9CsgjpTtT3uOgic-wlz9-qb7x-OavGyFUP3E0VEuO2VxBydO3InC6i7_)

可视化结果链接：

[![asciicast](https://asciinema.org/a/438519.svg)](https://asciinema.org/a/438519)